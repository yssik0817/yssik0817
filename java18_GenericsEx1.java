package javaEX;

import java.util.List;

import kr.co.soldesk.car.DumpTruck;
import kr.co.soldesk.car.car;
import kr.co.soldesk.car.sedan;

import java.util.ArrayList;

public class GenericsEx1 {

	public static void main(String[] args) {
		//객체를 여러개 담아서 사용가능한 타입(List(interface))
		//List를 구현한 클래스 ArrayList
		
		List<Object> a1 = new ArrayList<Object>();
		a1.add("사과");
		a1.add(200);
		a1.add("포도");
		a1.add("300");
		for(int i=0;i<a1.size(); i++) {
			if(a1.get(i) instanceof String ) {
				String s =(String)a1.get(i);
				System.out.println(s);
			}else {	
				
				
				
				int num= (Integer)a1.get(i);
				;System.out.println(num);
			}
			List<String> a2 = new ArrayList<String>();
			a2.add("사과");
			a2.add("200");
			a2.add("포도");
			a2.add("300");
			
			List<car> a3= new ArrayList<car>();
			a3.add(new sedan(4,4,"화이트"));
			a3.add(new DumpTruck(6,4,"은색"));
			a3.add(new sedan(4,4,"블루"));
			a3.add(new DumpTruck(6,2,"회색"));
			//실행 for 덤프트럭이 아니면 start하고
			//덤프면 시동을 걸고 덤프아웃
			
			for(int i1=0; i1<a3.size(); i1++) {
				if(a3.get(i1)instanceof DumpTruck) {
					 DumpTruck t =(DumpTruck) a3.get(i1);
					 t.start();
					 t.dumpOut();
					
				}else {
					sedan s= (sedan) a3.get(i1);
					s.start();
					s.drive();
				}
			}
		
		
		
	}
	}}

