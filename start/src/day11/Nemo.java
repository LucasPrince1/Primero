package day11;

public class Nemo {
	
	private int garo, sero, area, rank;
	

	//기본 생성자
	public Nemo() {}
	
	//입력받은 데이터를 셋팅해서 객체로 만들수있는 생성자
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		rank = 1;
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
	public void setArea() {
		area = garo*sero;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}
	
}
	
	
	
