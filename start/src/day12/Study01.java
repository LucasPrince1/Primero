package day12;

/*
  	랜덤하게 3 ~ 5 정수를 발생시켜서
	  	3이 나오면 삼각형
	  	4가 나오면 사각형
	  	5가 나오면 원
  	의 형태로 10개의 도형을 만들어서
  	하나의 변수로 관리하고
  	각 도형의 내용을 출력하세요.
 */

public class Study01 {

	private Figure[] fig;
	
	
	public Study01() {
		setFig();
		figPrint();
	}
	
	//fig 배열의 내용을 출력해주는 함수
	
	public void figPrint() {
		/*배열이므로 반복해서 출력..
		 이미 배열에 채워진 객체에서 출력해주는 함수가 있으므로
		 각 방에 들어있는 객체 꺼내서 출력함수를 호출해주면 된다.
		 */
		for(Figure f : fig) {
			f.toPrint();
			System.out.println();
			System.out.println();
		}
		
	}
	
	//배열변수 초기화 시켜주는 함수
	public void setFig() {
		fig = new Figure[10];
		
		//각 방에 도형을 채워넣어보자
		
		for(int i=0; i<fig.length; i++) {
			int no = getRndNo();
			
			switch(no) {
			case 3 : 
				fig[i] = new Semo((int)(Math.random()*21+5), (int)(Math.random()*21+5));
				break;
			
			case 4 : 				
				fig[i] = new Nemo((int)(Math.random()*21+5), (int)(Math.random()*21+5));
				break;
				
			case 5 : 
				fig[i] = new Dongl((int)(Math.random()*21+5));
				break;
				
		}
		}
	}
	
	
	
	
	
	
	//랜덤하게 3 ~ 5 의 숫자를 발생시켜주는 함수
	public int getRndNo() {
		return (int)(Math.random()*(5-3+1)+3);
		 
	}
	
	public static void main(String[] args) {
		new Study01();

	}

}
