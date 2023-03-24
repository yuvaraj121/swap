package org.test;

import java.util.Scanner;

public class SwappTwoNumbers {
	public static void main(String[] args) {
		int x, y , temp;
		 System.out.println(" Enter The Values Of x and y ");
		 Scanner Scan = new Scanner(System.in);
		 
		 x= Scan.nextInt();
		 y = Scan.nextInt();
		 
		 System.out.println(" Before Swapping \nx=" + x+"\n y="+y);
		 
		 temp =x;
		 x=y;
		 y= temp;
		 System.out.println(" After Swapping \nx ="+x+"\n y="+y);
		 
	}

}
