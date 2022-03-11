package day09;

/*
    	5학생의 3과목 점수를 배열에 입력한후
    	총점을 구하는 프로그램을 작성하세요
    	
    	단, 점수입력, 계산, 출력은 함수로 처리하세요.
 */
public class Test04 {

	public Test04() {
		int[][] stud = new int[5][4];
		//점수만들고
		setArr(stud);
		//총점구하고
		for(int i=0; i<stud.length;i++) {
			setTotal(stud[i]);
		}
		//내용출력
		toPrint(stud);
	}
	
	public static void main(String[] args) {
	new Test04();
	}

	//배열을 입력해서 실행하면 점수를 채워주는 함수
	public void setArr(int[][] score) {
		for(int i=0 ; i<score.length ; i++) {
			//학생수만큼 반복
			for(int j=0; j< score[i].length -1;j++) {
				score[i][j] = (int)(Math.random()*(41)+60); 	//과목점수만들고
				}
		}
		//이 함수의 경우는 입력된 주소의 내용의 변경하는 것이므로
		// 결국 배열을 반환해주지 않아도 된다.
	}
	
	///한 학생의 점수 배열을 입력하면 총점을 계산해서 셋팅해주는 함수
	public void setTotal(int[] score) {
		int sum = 0;
		//입력된 점수를 누적해서 더해주고
		for(int i=0; i<score.length-1 ; i++) {
			sum += score[i];
		}
		//총점 방에 누적된 점수 입력
		score[3] = sum;
		//score[3] = sum;
	}
	//출력하는 함수
	public void toPrint(int[][] arr) {
		for(int i=0; i< arr.length; i++) {
			//한 학생의 점수를 뽑고
			System.out.print((char)('A' + i)+" 학생 : ");
			for(int j=0; j<arr[i].length; j++) {
				// 각 과목점수 추출해서
				System.out.printf("%4d ", arr[i][j]);
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
	}










