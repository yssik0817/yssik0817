package javaEX;

public class ReferenceEx1 {

	public static void main(String[] args) {
		boolean r = new Integer("1") == new Integer("1");//1과 1이 같냐
		System.out.println(r);//false ->따로따로 만들어지거라 다르다
		
		r=new Integer("1").equals(new Integer("1"));//Integer("00") 안에있는 슷자비교
		System.out.println(r);//true
		
		//compareTo
		int v=new Integer("1").compareTo(new Integer("1"));
		System.out.println(v);//0
		v=new Integer("1").compareTo(new Integer("2"));
		System.out.println(v);//-1
		v=new Integer("2").compareTo(new Integer("1"));
		System.out.println(v);//1
		
		
		
		
	}

}
