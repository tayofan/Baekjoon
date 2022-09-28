package kr.or.baekjoon.brute_force;

import java.util.Scanner;

public class No1436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int num = 0;
		
		while(true) {
			if((num + "").contains("666")) count++;
			if(count == n) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}

}
