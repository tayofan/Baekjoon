package kr.or.baekjoon.set_map;

import java.util.HashMap;
import java.util.Scanner;

public class No10815 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		
		int n = scan.nextInt();
		int[] card = new int[n];
		for(int i = 0; i < n; i++) {
			card[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] compare = new int[m];
		for(int i = 0; i < m; i++) {
			compare[i] = scan.nextInt();
			map.put(compare[i], 0);
		}
		
		for(int i = 0; i < n; i++) {
			if(map.containsKey(card[i])) {
				map.put(card[i], 1);
				count++;
			}
			if(count == map.size()) break;
		}
		
		for(int i = 0; i < m; i++) {
			sb.append(map.get(compare[i]) + " ");
		}
		System.out.println(sb);
	}

}
