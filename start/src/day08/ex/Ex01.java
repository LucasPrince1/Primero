package day08.ex;
/*
 	7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고 ==> 60 ~ 100
 	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
 	결과를 출력하는데 
 	평균도 계산해서 출력하세요.
 	
 	
 */
public class Ex01 {

	public static void main(String[] args) {
		// 학생 배열
		int[][] stud = new int[7][6]; // 맨 마지막칸에 총점넣기 위해 5가 아니라 6
		
		double ave = 0;
		
		for(int i=0; i<stud.length ; i++) {
			for(int j=0; j<stud[i].length-1;j++) {
				
				int score = (int)(Math.random()*(100-60+1)+60);
				
				stud[i][j]= score;
				stud[i][5] += stud[i][j];
				
				 ave = (double)(stud[i][5]/5);
				System.out.print(score + " | " );
				
			}
			System.out.print(stud[i][5]);
			System.out.print(" | " + ave);
			
			System.out.println("");
		}

	}

}
