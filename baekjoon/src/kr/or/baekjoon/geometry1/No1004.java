package kr.or.baekjoon.geometry1;

import java.util.Scanner;

public class No1004 {
	// 점에서 중심사이의 거리가 작은 경우!!!
		// 단 두점 모두 작은 경우네는 제외!!!!
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			StringBuilder sb = new StringBuilder();
			
			int t = scan.nextInt();
			for(int i = 0; i < t; i++) {
				int cnt = 0;
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				
				int n = scan.nextInt();
				for(int j = 0; j < n; j++) {
					Plant pl = new Plant(scan.nextInt(), scan.nextInt(), scan.nextInt());
//					System.out.println(pl.dis(x1, y1));
//					System.out.println(pl.dis(x2, y2));
//					System.out.println(pl.dis(x1, y1) ^ pl.dis(x2, y2));
					if(pl.dis(x1, y1) ^ pl.dis(x2, y2)) {
						cnt++;
					}
//					System.out.println(cnt);
				}
				sb.append(cnt).append("\n");
			}
			System.out.println(sb);
		}
		
		static class Plant {
			int x;
			int y;
			int r;
			
			public Plant(int x, int y, int r) {
				this.x = x;
				this.y = y;
				this.r = r;
			}
			
			public boolean dis(int x, int y) {
				if((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) < this.r*this.r) {
					return true;
				}else {
					return false;
				}
			}
		}
}

