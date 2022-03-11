package day08.ex;

/*
 	Ex01에서 만든 배열의 내용을 
 	다섯과목의 7학생의 배열로 바꿔서 
 	해결하세요.
 	
 */
public class Ex02 {

	public static void main(String[] args) {

		int[][] subj = new int[6][7];	//배열 만들기
	
		for(int i=0; i<subj.length-1;i++) {
			for(int j=0; j<subj[i].length; j++) {
				
				int score = (int)(Math.random()*(100-60+1)+60); //랜덤 점수 만들기
				
				subj[i][j] = score; //배열에 점수 채우기
				
				System.out.print(score + " | ");	//출력
								
			}
			 for(int c=0; c<subj.length-1;c++) { //총점 채우기
			    subj[5][i] += subj[c][i] ;
			}
			 
			System.out.println("");
			
		}
		System.out.print(subj[5][0] + " | "+subj[5][1] + " | "+subj[5][2] + " | "+subj[5][3] + " | "+subj[5][4] + " | ");
		// double ave = (double)subj[5][i]/(double)5;
		//System.out.print(ave);

	}

}
