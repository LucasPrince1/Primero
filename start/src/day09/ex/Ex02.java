package day09.ex;

/*	
 	문제2]
 		반지름 하나를 랜덤하게 입력한 후
 		원의 넓이
 		원의 둘레
 		를 계산해서 출력하는 프로그램을 작성하세요.
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산해주는 함수 , 둘레 계산함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요.
 */

public class Ex02 {

	public Ex02() {
		int no1 = radian();
		double no2 = size(no1);
		double no3 = length(no1);
		toPrint(no1, no2, no3);
			
		}
	
	public static void main(String[] args) {
		new Ex02();
		
	}
	
	//반지름 랜덤하게 만드는 함수
	public int radian() {
		int no = (int)(Math.random()*(10)+1);
		return no;
	}
	
	//넓이 계산 함수
	public double size(int no1) {
		double result = 3.14 * no1 * no1;
		return result;
	}
	
	//둘레 계산함수
	public double length(int no1) {
		double result = 2*3.14*no1;
		return result;
	}
		
		
	//출력함수
	public void toPrint(int no1, double no2, double no3) {
		System.out.println("반지름 : " +no1);
		System.out.println("원의 넓이 : " +no2);
		System.out.println("원의 둘레 : " +no3);
		
		
	}
	
	
		
	}

