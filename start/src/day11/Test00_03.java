package day11;

public class Test00_03 {
	Nemo[] sagak;
	
	
	public Test00_03() {
		//배열셋팅
		setSagak();
		
		//순위 결정하고
		setRank();
		//출력
		toPrint();
	}
	
	//배열 세팅해주는 함수
	public void setSagak() {
		sagak = new Nemo[5];
		for(int i=0; i<sagak.length; i++) {
		sagak[i] = new Nemo((int)(Math.random()*(21)+5),(int)(Math.random()*(21)+5));
		}
		
	}
	/*
	 네모 순위별로 정렬해서 기억시키고 출력하세요
	 */
	
	
	
	public void toPrint() {for(int i=0; i<5; i++) {
		Nemo n = sagak[i];
		
		int garo = n.getGaro();
		int sero = n.getSero();
		int area = n.getArea();
		int rank = n.getRank();
		
		System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d이고 넓이는 %4d이고 %2d 번째 큽니다.\n", garo, sero, area, rank);
	}	
	}
	
	public void setRank() {
		//할일
		for(int i=0; i<sagak.length; i++) {
		//각 네모를 꺼내고
		Nemo n = sagak[i];
		//꺼낸 네모의 면적 꺼내고
		int me = n.getArea();		
		//꺼낸 네모의 순위를 꺼내고
		//다른 네모들과 면적비교해서 순위 수정하고
		for(int j=0; j< sagak.length; j++) {
			int na = n.getRank();
			//다른 네모의 면적 꺼내고
			int you = sagak[j].getArea();
			if(me < you) {
				n.setRank(na+1);
			}
			
		}
		
		
		}
	}
	
	
	public static void main(String[] args) {
		new Test00_03();

	}

}
