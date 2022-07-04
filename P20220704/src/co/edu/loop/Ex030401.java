package co.edu.loop;

public class Ex030401 {
	public static void main(String[] args) {
		int temp1=0;
		int temp2=0;
		
		while(true) {
			temp1=(int)(Math.random()*6)+1;
			temp2=(int)(Math.random()*6)+1;
			if(temp1+temp2==5) {
				System.out.printf("(%d, %d)\n", temp1, temp2);
				break;
			}else {
				System.out.printf("(%d, %d)\n", temp1, temp2);			
			}
		}
	}
}
