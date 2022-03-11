package day11;

public class Circle01 extends Moyang {
	private int rad;
	private double around, area;
	
	public Circle01() {}
	public Circle01(int rad) {
		this.rad = rad;
		
		setAround();
		setArea();
		
	}
	
	
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getAround() {
		return around;
	}
	public void setAround(double around) {
		this.around = around;
	}
	public void setAround() {
		around = 2 * rad * 3.14;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("반지름 %3d, 둘레가 %6.2f, 넓이가 %6.2f인 원\n", rad, around, area);
	}
	
}
