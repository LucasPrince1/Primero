package day10.ex;
import java.util.*;
/*
 	문제1]
 		다음 변수를 가지는 Student 클래스를 제작하세요.
 		
 		String name; 
 		int ban, no, kor, eng, math; 
 		
 		클래스를 만들고
 		
 		Ex01 클래스에서 
 			한명의 데이터를 입력해서 출력하기
 			5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
 		
 		1. 한개의 함수 내에서 처리하기..
 		2. 기능별로 분리해서 함수 만들어서 처리...
 		
 		보너스]
 			int rank, total;
 			double avg; 			
 */

public class Ex01 {
	
	String name[];
	int ban[], no[] ,kor[], eng[], math[];
			
	public Ex01() {
		setData();
		Student[] red = setTest();
	 	
		toPrint(red);
		for(Student com : red) {
			System.out.println(com);
		}
	}
	
	public void toPrint (Student[] s) {
		for(int i=0; i<s.length; i++) {
		System.out.println("이름 : " + s[i].getName());
		System.out.println("반 : " + s[i].getBan());
		System.out.println("번호 : " + s[i].getNo());
		System.out.println("국어 : " + s[i].getKor());
		System.out.println("영어 : " + s[i].getEng());
		System.out.println("수학 : " + s[i].getMath());
		System.out.println(Arrays.toString(ban));
		}
		
	}
	
	
	//준비된 데이터를 Student[] 타입의 데이터로 만들어서 반환해주는 함수
	public Student[] setTest() {
		
		Student[] hyup = new Student[5];
		
		for(int i=0; i<5; i++) {
			hyup[i] = new Student();
		}
		
		for(int i=0; i<hyup.length; i++) {
			Student st = hyup[i];
			
			st.setName(name[i]);
			st.setBan(ban[i]);
			st.setEng(eng[i]);
			st.setKor(kor[i]);
			st.setMath(math[i]);
			st.setNo(no[i]);
				
		}
		return hyup;		
	}
	
	//각 데이터를 초기화 시켜주는 함수
	public void setData() {
		name = new String[] {"제니", "리사", "로제", "지수", "둘리"};
		ban = new int[] {1,2,3,2,1};
		no = new int[] {22,13,4,5,2};
		eng = new int[] {99,56,65,45,11};
		kor = new int[] {11,56,99,56,88};
		math = new int[] {65,55,23,33,97};
		
	}
	
		public static void main(String[] args) {
		new Ex01();
		
	}

}
