package kr.or.baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No25305 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		scan.nextLine();
		
		int[] score = new int[n];
		
		for(int i = 0; i < n; i++) {
			score[i] = scan.nextInt();
		}	
		
		Arrays.sort(score);
		
		System.out.println(score[n-k]);
		
	}
}
