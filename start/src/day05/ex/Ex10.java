package day05.ex;

/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
		15 51 24 42 33
 */
public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1; i<6; ++i) {
			for(int j=1; j<6; ++j) {
			if( i+j==6) {
			
				System.out.print("(" +i+"."+j + ") ");			
			}
				
			}
		}
	}

}
