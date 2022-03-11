package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
		힌트 : no * (-1)
 */
public class Ex09 {

	public static void main(String[] args) {
				
		for(int i=0; i<100; i++) {
					
		int no2 = 2*i+1; // 1 3 5 199
			
		int no1 = 2*i+2; // 2 4 6  198
			
					
		//	char no3 = (char)no1;
		//  char no4 = (char)no2;
			
		System.out.print(" + " + no2);
		System.out.print(" - " + no1);
			
		// i=1 : -i i다음의 수까지의 합 -i+2i+1 = i+1>100 : i=100
			
		}
		
		System.out.print(" + " + 201);
	}

}
/* int no = -1;
   int sum = 0;
   int i = 1;
   for(i =1; ; i++){
   		no = no* (-1)
   		sum = sum + i * no;
   		if(sum>100){
   		break;
   		}
      
   }
  	System.out.println("1부터 " + (i + no) + " 까지의 합이
  	처음 100을 넘기게 된다.");
 
 */




