package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
	
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();		
		if(a%100==0) {
			if(a%400==0) {
				System.out.println("是闰年");
				}
			else {
				System.out.println("不是闰年");
			
			     }
		}
		else if(a%4==0) {
			System.out.println("是闰年");
		}
		else {
			System.out.println("不是闰年");
		}
	}

}
