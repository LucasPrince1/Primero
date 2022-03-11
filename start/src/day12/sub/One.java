package day12.sub;

public class One implements Figure {

	private int rad;
	private double around, area;
	
	public One() {} 	
	public One(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	} 	
	
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setAround() {
		around = 2 * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d, 둘레가 %6.2f, 면적이 %6.2f입니다.", rad, around, area);
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	

	
}
