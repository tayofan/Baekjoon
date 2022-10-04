package kr.or.baekjoon.geometry1;

import java.util.Scanner;

public class No1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			
			int dis = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
			
			if(x1==x2 && y1==y2 && r1 == r2) {
				sb.append(-1 + "\n");
			}else if(dis > (r1+r2)*(r1+r2)) {
				sb.append(0 + "\n");
			}else if(dis < (r1-r2)*(r1-r2)) {
				sb.append(0 + "\n");
			}else if(dis == (r1+r2)*(r1+r2)) {
				sb.append(1 + "\n");
			}else if(dis == (r1-r2)*(r1-r2)) {
				sb.append(1 + "\n");
			}else {
				sb.append(2 + "\n");
			}
		}
		System.out.println(sb);
	}
}

