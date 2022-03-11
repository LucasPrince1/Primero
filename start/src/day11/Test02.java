package day11;

public class Test02 {
	public Test02() {
		for(int i=0; i<5; i++) {
			
		//원 하나 만들어본다.5~25
		Won c1 = new Won((int)(Math.random()*21+5));
		
		//c1의 둘레계산
		int rad = c1.getRad();
		double around = rad * 2 * Won.PI;
		double area = rad * rad * Won.PI;
		
		c1.setAround(around);
		c1.setArea(area);
		//출력
		System.out.printf("반지름이 %3d이고 둘레가 %7.2f이고 넓이가 %7.2f인 원\n", rad, around, area);
	}
	}
	
	public static void main(String[] args) {
	new Test02();
	}

}
