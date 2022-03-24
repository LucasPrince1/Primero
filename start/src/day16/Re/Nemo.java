package day16.Re;



public class Nemo {
	
	private int width, height;
	private double area;

	public Nemo() {	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		area = width * height;
	}
	
	//가로가 같으면 같은 사각형으로 만들기
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
				
		bool = width == ((Nemo)o).getWidth();
		
		return bool;
	}
	
	@Override
	public int hashCode() {
		return width; 
	}
	
	@Override
	public String toString() {
		return "Nemo [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


}
