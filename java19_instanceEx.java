package javaEX;

import java.math.BigDecimal;

public class instanceEx {

	public static void main(String[] args) {
		String value = "가나다라마";
		boolean r =value instanceof String;//r은 글자가 맞니?
		Object v = value;//->v는 "가나다라마"다 .
		System.out.println(r);//true
		System.out.println(v);//가나다라마
		Object object = "가나다라";
		r= object instanceof BigDecimal;
		System.out.println(r);//false
		
		
		for(int i=1; i<26; i++) { 
			  System.out.print(i); 
			if(i%5==0)  System.out.println(""); 
			 }
				/*
				 * 12345 
				 * 678910 
				 * 1112131415 
				 * 1617181920 
				 * 2122232425
				 */
}}
