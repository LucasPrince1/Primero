package day07.ex;

import java.util.Arrays;

/*
 	문2[
 		
 		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
 	을 준비하고 
 	
 	79456원을 coin에 기억된 화폐단위로 지불하려고 할때 각각의 단위 몇장씩
 	필요한지 배열에 기억시켜서 배열의 내용을 출력하세요.
 	예]
 	10000   : 7
 	5000	: 1
 	...
 	
 */


public class Ex02 {

	public static void main(String[] args) {
		
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		// t - t/coin1*coin1 = t1 t2=t1-t1/coin2*coin2 4456   
		int[] total = new int[8];
		total[0] = 79456;
		
		for(int i=1; i<coin.length;i++) {
		 total[i] = ((total[i-1])/coin[i])*coin[i];
			
		// System.out.println(Arrays.toString(coin));
		 System.out.println(Arrays.toString(total));
		}


	}

}
