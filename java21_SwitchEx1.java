package javaEX;

public class SwitchEx1 {

	public static void main(String[] args) {
		/*switch(조건) ->값(정수:int char){
			case 값1: break;
			case 값2: break;
			.............
			default: ;}
		*/
		//ii가 1이면 "1이다"라고 뜨고........5까지 뜬다. case6.. 하면 안뜬다.
		//int i[] ={2,3,4,5}; ->이렇게하면 '1이다' 안뜬다. 1없어서
		
		int i[] ={1,2,3,4,5};
		for(int ii:i) {
		switch(ii) {
		case 1:System.out.println("1이다");
		break;
		case 2:System.out.println("2이다");
		break;
		case 3:System.out.println("3이다");
		break;
		case 4:System.out.println("4이다");
		break;
		default:System.out.println("5입니다.");
		//{1,2,3,4,5,6};이면 "5입니다." 2번나옴
		 
		/* case 5:System.out.println("5이다"); break;
		  case6.. 하면 안뜬다.*/
	
		
		
		
		
		}}
		
		
		
		
		
		
		
		
		


}}
