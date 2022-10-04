package kr.or.baekjoon.number_combin;

import java.util.Scanner;

public class No5086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			if(num1 == 0 && num2 == 0) break;
			
			sb.append(factor(num1, num2)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static String factor(int num1, int num2) {
		String str = "neither";
		if(num1%num2 == 0) str = "multiple";
		if(num2%num1 == 0) str = "factor";
		return str;
	}

}
