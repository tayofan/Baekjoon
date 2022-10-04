package kr.or.baekjoon.number_combin;

import java.util.Scanner;

public class No2609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		for(int i = Math.max(n1, n2); i >=0 ; i--) {
			if(n1%i == 0 && n2%i == 0) {
				sb.append(i + "\n");
				break;
			}
		}
		
		int cnt = Math.min(n1, n2);
		while(true) {
			if(cnt%n1 == 0 && cnt%n2 == 0) {
				sb.append(cnt + "\n");
				break;
			}
			cnt++;
		}
		
		System.out.println(sb);
		
	}

}
