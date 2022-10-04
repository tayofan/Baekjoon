package kr.or.baekjoon.geometry1;

import java.io.IOException;
import java.util.Scanner;

public class No2477 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int mx = 0; int mxindx = 0; // 가로
		int my = 0; int myindx = 0; // 세로
		
		int[] dir = new int[6];
		int[] len = new int[6];
		
		int k = scan.nextInt();

		for(int i = 0; i < 6; i++) {
			dir[i] = scan.nextInt();
			len[i] = scan.nextInt();
			if(dir[i] == 1 || dir[i] == 2) { // 가로
				if(mx < len[i]) {
					mx = len[i];
					mxindx = i;
				}
			}else { // 세로
				if(my < len[i]) {
					my = len[i];
					myindx = i;
				}
			}
		}
		System.out.println((mx*my - len[(mxindx+3)%6]*len[(myindx+3)%6])*k);
	}
}
