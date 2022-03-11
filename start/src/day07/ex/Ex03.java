package day07.ex;

import java.util.Arrays;

/*
	 반지름 5개를 기억하는 배열 만들고
	 랜덤하게 반지름을 만들어서 기억시키고 - 1 ~ 20
	 각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
	 넓이도 배열에 기억시켜주세요.
	 */
public class Ex03 {

	public static void main(String[] args) {
		
		int[] rad = new int[5];
		
		for(int i =0; i<rad.length; i++) {
			
			rad[i] =(int)(Math.random()*(20)+1);
			
			System.out.print("반지름 : " + rad[i] + "\t");
		}
		
		System.out.println();
		double[] size = new double[5];
		
		for(int i=0; i<size.length; i++) {
			
			size[i] = (double)(3.14*rad[i]*rad[i]);
		
			System.out.print("원넓이 : " + size[i] + "\t");
		
		}
		
	}

}
