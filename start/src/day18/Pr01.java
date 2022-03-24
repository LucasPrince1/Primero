package day18;

public class Pr01 {

	public Pr01() {
		Son son = new Son();
		Mara mara = new Mara();
		//New Born status
		
		//Runnable 상태로 전위
		son.start();
		mara.start();
		
	}

	public static void main(String[] args) {
		new Pr01();
	}

}

class Son extends Thread {
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("손흥민" + (i+1));
		}
		yield();
	}
}

class Mara extends Thread {
	@Override
	public void run() {
		for(int i=0; i<50 ; i++) {
		System.out.println("마라도나" + (i+1));
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		}
	}
}