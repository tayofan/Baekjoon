package kr.or.baekjoon.number_combin;

import java.util.Scanner;

public class No1934 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			sb.append(p * q  / gcd(p, q)).append("\n");
		}
	
		System.out.println(sb);
	}
	
	public static int gcd(int p, int q)
	{
		if (q == 0) return p;
		return gcd(q, p%q);
	}

}
