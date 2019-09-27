package palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string:");
		 
		String str =sc.next();
		
		 char ch[]=str.toCharArray();
		 for(int i=ch.length-1;i>=0;i--) {
		reverse=reverse+str.charAt(i); //it stores the value of string in reverse i,e returns value
		 System.out.println("reverse string is :"+ch[i]);
		 }
		 if(str.equals(reverse))
		 {
			 System.out.println("palindrom");
		 }else System.out.println("not palindrom");

	}

}
