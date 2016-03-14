package com.workflow.demo.customasset;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "";
         if(a == null | a.isEmpty()){
            System.out.println("inside if"+a);
         }
         
         String aa = "Hello World";
         aa.substring(0,5);
         System.out.println(aa+aa.substring(0,5));

	}

}
