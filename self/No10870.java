package kr.or.baekjoon.self;

import java.util.Scanner;

public class No10870 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(fibo(n));
		
	}
	
	static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibo(n-1) + fibo(n-2);
	}
	

}
