package day07;

/*
  	정수 10개를 랜덤하게 만들어서 기억하는 배열을 만들고
  	기억된 정수를 내림차순 정렬해서 다시 기억시키고
  	배열의 데이터를 출력하세요.
 */
public class Test08 {

	public static void main(String[] args) {
		//배열만들고
		int[] num = new int[10];
		//데이터 채우고
		for(int i=0; i <num.length ; i++) {
			int no = (int)(Math.random()*99+1);
			
			//중복검사
			for(int j=0; j<i ; j++) {
				int soo = num[j];
				if(soo ==no ) {
					///중
					
				}
				
			}
			//이 행 실행하는 경우 중복검사 통과한 경우
			
			num[i]=no;
		}
		
		
	}

}
