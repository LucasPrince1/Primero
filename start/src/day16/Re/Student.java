package day16.Re;

public class Student {

	private String names;
	private int kor, math, eng;
	
	
	public Student() {	}
	public Student(String names, int kor, int math, int eng) {
		this.names = names;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
	@Override
	public String toString() {
		return "Student [names=" + names + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

}
