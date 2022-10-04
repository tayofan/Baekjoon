package kr.or.baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] arr = (scan.nextLine()).split("");
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
