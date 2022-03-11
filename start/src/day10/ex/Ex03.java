package day10.ex;
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

public class Ex03 {
	
	String names;
	int nos, bans, math, eng, kor;
	
	public Ex03() {
		
		setData();
		
		Student Tottenham = setTest();
		
		toPrint(Tottenham);
		
		
	}
	
	//데이터 초기화 함수
	public void setData() {
		names = "손흥민";
		nos = 11;
		bans = 2;
		math = 66;
		eng = 97;
		kor = 88;				
	}
	
	//Student 타입으로 변환 함수
	
	public Student setTest() {
		//이 함수는 Student 변수를 만들고
		Student Tott = new Student();
		//방에 Student 객체들을 채워넣는다
		//		Tott = new Student();
		// 방에 객체의 변수 데이터를 입력할 수 있는 상태가 된다.
				
		//데이터 채우기
			
		Tott.setName(names);
		Tott.setBan(bans);
		Tott.setNo(nos);
		Tott.setMath(math);
		Tott.setEng(eng);
		Tott.setKor(kor);
						
		return Tott;
	}
	
	
	//출력함수
	public void toPrint(Student Son) {
		System.out.println("이름 : " + Son.getName());
		System.out.println("번호 : " + Son.getNo());
		System.out.println("반 : " + Son.getBan());
		System.out.println("국어 : " + Son.getKor());
		System.out.println("영어 : " + Son.getEng());
		System.out.println("수학 : " + Son.getMath());
	}
	
	
	public static void main(String[] args) {
		new Ex03();

	}

}
