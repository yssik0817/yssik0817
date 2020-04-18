package javaEX;

public class BreakContinueEx1 {

	public static void main(String[] args) {
	//반복문에서 가장 가까운 반복문을 벗어나거나 : break
	//해당 반복문의 조건으로 이동 : continue
		for(int i=0; i<11; i++) {
			if(i==6)break;//6이 되면끝난다. 그래서 6이 안나온다.
			System.out.print(i);//012345
		}
		
		for(int i=1; i<11; i++) {
			if(i%2==0)continue;//i가 짝수면...음 홀수만 나오게한다.if조건 반대인게 나온다?
			System.out.print(i);//13579
		}
		
		System.out.println("***************************");
		//1234
		//6789
		//11121314...
		//int c=0;
		/*
		 * for(int i=1; i<6; i++)
		 *  { for(int j=1;j<6; j++) { 
		 *  c++; if(c%5==0)continue;
		 * System.out.printf("%3d",c); } 
		 * System.out.println();
		 * 
		 * for(int i=1; i<25; i+=5) { 
		 * System.out.printf("%3d",i); 
		 * for (int j=1; i<25;i++) { 
		 * System.out.printf("%3d",j); } }
		 */
		System.out.println("-----카운터를 이용한 예제");
		String stringValue="가나다라마";
		for (int i=0; i<stringValue.length(); i++) {
			System.out.println("[1]"+stringValue.charAt(i));
		}
		
		/*
		 * [1]가 
		 * [1]나 
		 * [1]다 
		 * [1]라 
		 * [1]마
		 */
		System.out.println("---------배열을 이용한 예제");
		char[] chars = stringValue.toCharArray();
		for (char charValue : chars) {
			System.out.println("[2]"+charValue);
		}
		/*
		 * [2]가 
		 * [2]나 
		 * [2]다
		 * [2]라 
		 * [2]마
		 */
		int ii[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<ii.length; i++) {
			System.out.println("[3]"+ii[i]);
			
		}
		/*
	    [3]1
		[3]2
		[3]3
		[3]4
		[3]5
		[3]6
		[3]7
		[3]8
		[3]9
		*/
		
		
		for(int i:ii) {
			System.out.println("[4]"+i);
		}
		/*
		[4]1
		[4]2
		[4]3
		[4]4
		[4]5
		[4]6
		[4]7
		[4]8
		[4]9
		*/
		String s[]= {"강아지","고양이","말","원숭이"};
		for(int i=0;i<s.length; i++) {
			System.out.println(s[i]);
		}
		/* String s[]= {"강아지","고양이","말","원숭이"};
		 * for(String ss:s)
		 * System.out.println(ss);*/
		/*
		강아지
		고양이
		말
		원숭이
		 */
		
		
		
		
		
		

}}
