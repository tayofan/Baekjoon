package kr.or.baekjoon.geometry1;

import java.io.IOException;
import java.util.Scanner;

public class No3053 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int r = scan.nextInt();
		double pi = Math.PI;
		
		sb.append(String.format("%.6f", pi*r*r)).append("\n");
		sb.append(String.format("%.6f", 2.0*r*r)).append("\n");
		System.out.println(sb);
	}
}
