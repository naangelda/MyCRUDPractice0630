package com.jp.ht.test;

public class Test {
	public static void main(String[] args) {
		String ids="1,2,3,4,";
		String ids2="";
		System.out.println(ids);
		if(ids.endsWith(",")) {
			 ids2= ids.substring(0, ids.lastIndexOf(","));
		}
		System.out.println(ids2);
		
		String[] idArray = ids2.split(",");
		for(String id:idArray) {
			System.out.print(id);
		}
		
		
	}
}	
