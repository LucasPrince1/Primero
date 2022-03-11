package day09.ex;

/*
 	사각형을 넓이를 계산하는 프로그램
 	
 	길이를 랜덤하게 만들어주는 함수
 	넓이를 계산해주는 함수
 	사각형의 내용을 출력해주는 함수
 */

public class Ex03 {
	public Ex03() {
		int width = length();
		int height = length();
		
		double size = size(width, height);
		toPrint(width, height, size);
		
		
	}

	public static void main(String[] args) {
		new Ex03();
		}
	
	//길이 랜덤 함수
	public int length() {
		int no1 = (int)(Math.random()*(10)+1);
		
		return no1;
	}
	/*//배열로 한번에 2개 뽑기
	public int[] length2() {
		int[] no1 = new int[2];   
		
		no1[0] = (int)(Math.random()*(10)+1);
		no1[1] = (int)(Math.random()*(10)+1);
		
		return no1;
	}*/
	//넓이 계산 함수
	public double size(double no1, double no2) {
		double result = no1*no2;
		return result;
	}
	
	//사각형의 내용 출력함수
	public void toPrint(double no1, double no2, double no3) {
		System.out.println("가로 : " + no1);
		System.out.println("세로 : " + no2);
		System.out.println("넓이 : " + no3);
		
	}
}
