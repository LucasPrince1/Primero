package day08;

/*
 	문자열 5개를 기억할 배열을 만들고
 	보기를 입력해 놓고
 	문제와 같이 화면에 출력하고 
 	
 	사용자가 정답을 입력하도록 해서
 	답안이 맞았는지 확인하는 프로그램을 작성하세요
 */import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		//문제 변수
		String quest = "다음 중 블랙핑크의 멤버가 아닌 사람은?";
		//보기변수
		String[] ans = new String[5];
		//보기 입력
		ans[0] = "제니";
		ans[1] = "둘리";
		ans[2] = "로제";
		ans[3] = "리사";
		ans[4] = "지수";
		
		
		// 정답 위치값 변수
		int dap = 1;
		
		// 문제가 완성이 되었으므로
		System.out.println(quest);
		//보기출력
		for(int i=0; i<ans.length;i++)
			System.out.println("\t" + (i+1) + ") " + ans[i]);
			
	
	
	//정답
	//입력도구 준비
	Scanner sc = new Scanner(System.in);
	//입력메세지
	System.out.print("정답 : ");
	
	int no = sc.nextInt()-1;
	//정답과 비교해서 결과출력
	String result = no == dap ? "정답" : "오답";
	
	System.out.print(result);
	
	
	}
}
