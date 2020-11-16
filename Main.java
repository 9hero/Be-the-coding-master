package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a  = sc.next();
		String[] b = a.split("[.]");
		
		int aa = Integer.parseInt(b[0]);
		int bb = Integer.parseInt(b[1]);
		int cc = Integer.parseInt(b[2]);
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		
		System.out.printf("04%d.%02d.%02d",aa,bb,cc);
		
	}
	
}


	