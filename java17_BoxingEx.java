package javaEX;

public class BoxingEx {

	public static void main(String[] args) {
		//boolean, byte, short, int, char
		//long, float, double
		/*
		  같은 스펠링에 대문자로 시작하는 애들 
		  : Boolean, Byte, Sort, Integer, Character 
		  	Long, Float, Double
		*/
		int a= 20;
		Integer aa = a;//Boxing
		int c = aa;//unboxing
		Integer cc= new Integer(20);
		//값 전부 20
		System.out.println(a);
		System.out.println(aa);
		System.out.println(c);
		System.out.println(cc);
	
		
		//casting -> 앞에있는 타입에 맞춰준다.
		byte b= (byte) 1000;//byte에 들어갈수없는걸 짜른다.
		System.out.println(b);//-24 
		
		//논리 연산자. ->not > && > ||
		boolean r1 = true && false;//참과 참은 참
		boolean r11 = false && true;//참과 참은 참
		System.out.println(r1);//false
		boolean r2 = true || false;//참 또는 거짓
		boolean r22 = false || true;//참 또는 거짓
		System.out.println(r22);//true
		
		//not연산자 - !
		boolean r3= true;
		System.out.println(!r3);//false
		
	
		
		
		
		
		
		
		
}}
