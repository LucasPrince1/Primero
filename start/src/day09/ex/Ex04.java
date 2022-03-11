package day09.ex;

/*
 	문제4]
 	
 		1차원 배열에 정수 10개를 입력한 후 : 1 ~ 20
 		합계와 평균을 구해주는 프로그램을 작성하세요.
 		
 		배열에 정수를 랜덤하게 채워주는 함수
 		합계를 계산해주는 함수
 		평균 계산해주는 함수
 		출력해주는 함수
 		
 */
public class Ex04 {
	
	public Ex04() {
		int[] score = new int[10];
		score = ranNum();
		
		
	}

	public static void main(String[] args) {
		new Ex04();
	}
	
	//배열에 랜덤정수 채우는 함수
	public int[] ranNum() {
		
		int[] score = new int[10];
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*(20)+1);
		}
		return score;
	}
	
	
	//합계 계산 함수
	
	public int addAll(int[] arr) {
			int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
		}
			return sum;
		}
		
		//평균 계산 함수
		
		public double getA(double no) {
			
			double result = (double)no/(double)10;
			
			return result;
		}
	}


