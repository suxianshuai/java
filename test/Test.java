package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
	
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();		
		if(a%100==0) {
			if(a%400==0) {
				System.out.println("������");
				}
			else {
				System.out.println("��������");
			
			     }
		}
		else if(a%4==0) {
			System.out.println("������");
		}
		else {
			System.out.println("��������");
		}
	}

}
