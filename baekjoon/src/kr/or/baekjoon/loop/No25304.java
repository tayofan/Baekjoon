package kr.or.baekjoon.loop;

import java.io.IOException;
import java.util.Scanner;

public class No25304 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		
		int[] price = new int[n];
		int[] num = new int[n];
		
		for(int i = 0; i < price.length; i++) {
			price[i] = scan.nextInt();
			num[i] = scan.nextInt();
		}
		
		if(x == priceSum(price, num)) System.out.println("Yes");
		else System.out.println("No");
	}
	
	private static int priceSum(int[] price,int[] num) {
		
		int priceSum = 0;
		for(int i = 0; i < price.length; i++) {
			priceSum += price[i] * num[i];
		}
		
		return priceSum;
	}

}
