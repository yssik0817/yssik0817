package javaEX;

public class WhileEx1 {

	public static void main(String[] args) {
		//While 은 조건만 있다. (반복문), 초기값과 증가값을 설정.
		
		//1-10까지 출력하는 루틴 만들기(while 이용해서)
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;//이게 없으면 무한 루프-> 1만계속나온다.
		}
		System.out.println("**********");
		//do~ while ->실행을먼저하고 조건을비교한다.
		i=1;
		do {
			System.out.println(i);
			i++;//이게 없으면 무한 루프
		}while(i<=10);
		
		
		i=1;
		do {
			System.out.println(i);
			i++;//이게 없으면 무한 루프
		}while(i<0);//1만 나온다.
		
		
		
		
		
		
		
		
	}

}
