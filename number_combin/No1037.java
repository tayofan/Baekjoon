package kr.or.baekjoon.number_combin;

import java.util.Arrays;
import java.util.Scanner;

public class No1037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int[] factor = new int[n];
		for(int i = 0; i < n; i++) {
			factor[i] = scan.nextInt();
		}
		
		Arrays.sort(factor);
		
		System.out.println(factor[0] * factor[n-1]);
	}

}
