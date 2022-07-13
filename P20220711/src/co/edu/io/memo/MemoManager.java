package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 등록, 조회, 삭제, 목록
 */
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();;
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");

	private MemoManager() {
		// 파일 정보 => ArrayList.
		readFromFile();
	}

	private static MemoManager instance = new MemoManager();

	public static MemoManager getInstance() {
		return instance;
	}

	// 등록.
	public void inputData() {
		System.out.print("메모 번호를 입력하시오 > ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("작성한 날짜를 입력하시오 > ");
		String date = scn.nextLine();
		System.out.print("메모 내용을 입력하시오 > ");
		String content = scn.nextLine();

		memoStorage.add(new Memo(no, date, content));
	}

	// 날짜 입력하고 모든 메모 출력.
	public void search() {
		System.out.print("날짜를 입력하시오 > ");
		String memoDate = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.get(i).getDate().equals(memoDate)) {
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}

	// 번호 -> 삭제.
	public void deleteData() {
		System.out.print("삭제할 메모의 번호를 입력하시오 > ");
		int delNo = Integer.parseInt(scn.nextLine());
		Iterator<Memo> iter = memoStorage.iterator();
		while (iter.hasNext()) {
			Memo memo = iter.next();
			if (memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("일치하는 번호가 없습니다.");

//		for(int i= 0 ; i<memoStorage.size();i++) {
//			if(memoStorage.get(i).getNo()==delNo) {
//				memoStorage.remove(i);
//		System.out.println("삭제가 완료되었습니다.");
//			}
//	}
	}

	// 종료.
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체 처리해주는 보조스트림 ObjectOutputStream, ObjectInputStream : ArrayList => 바이트 배열
			// 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage);
			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listUp() {
		for (Memo memo : memoStorage) {
			System.out.println(memo.toString());
		}
	}

	// 파일 정보를 받아와 컬렉션 타입으로 변경하는 메소드.
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
