package day12;

public class Nemo extends Figure{

	private int garo, sero, area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	
	@Override
	public void setArea() {	
		area = garo * sero;
	}
	
	@Override
	public void toPrint(){
		System.out.printf("이 삼각형은 밑변이 %3d, 높이가 %3d, 면적이 %6d입니다.", garo, sero, area);
	}
	
	
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
	
}
