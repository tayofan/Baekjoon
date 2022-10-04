package kr.or.baekjoon.geometry1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class No4153 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		int[] right = new int[3];
		
		while(true) {
			for(int i = 0; i < right.length; i++) {
				right[i] = scan.nextInt();
			}
			
			if(right[0] == 0 && right[1] == 0 && right[2] == 0) break;
			
			Arrays.sort(right);
			if(right[2]*right[2] == right[1]*right[1] + right[0]*right[0]) {
				sb.append("right").append("\n");
			}else {
				sb.append("wrong").append("\n");				
			}
			
		}
		
		System.out.println(sb);
	}
}
