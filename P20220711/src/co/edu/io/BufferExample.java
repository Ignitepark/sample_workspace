package co.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 보조 스트림 생성. 바이트 기반 => 문자 기반 ( InputStreamReader, OutputStreamWriter )
 * 			버퍼스트림(성능향상)
 */
public class BufferExample {
	public static void main(String[] args) {
		StreamToReader();
	}

	// 버퍼 스트림
	public static void bufferReaderWriter() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png"); // 기본 스트림.
			BufferedInputStream bis = new BufferedInputStream(fis); // 보조 스트림.

			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png"); // 기본 스트림.
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 보조 스트림.

			while (true) {
				int bt = bis.read();
				if (bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void StreamToReader() {

		// 바이트 스트림 -> 문자 스트림.
		InputStream is = System.in; // 키보드 입력.
		InputStreamReader isr = new InputStreamReader(is);
		System.out.print("입력 > ");
		char[] cbuf = new char[10];
		try {
//			while (true) {
			int b = isr.read(cbuf);
			for (int i = 0; i < b; i++) {
				System.out.print(cbuf[i]);
			}
			System.out.println();
//			}
			isr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void StreamToWriter() {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);

		Scanner scn = new Scanner(System.in);
		System.out.print("입력 > ");
		String text = scn.nextLine();

		try {
			osw.write(text + "\n");
			osw.write("실행.");
			osw.flush();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
