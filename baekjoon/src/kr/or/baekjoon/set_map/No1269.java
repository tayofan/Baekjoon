package kr.or.baekjoon.set_map;

import java.util.HashSet;
import java.util.Scanner;

public class No1269 {
	
	static HashSet<String> set = new HashSet<String>();

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		for(int i = 0; i < s.length(); i++) {
			subString(s, i);
		}
		
		System.out.println(set.size());
		
	}
	
	public static void subString(String str, int i) {
		for(int j = 0; j < str.length() + 1 - i; j++) {
			set.add(str.substring(j, j+i));
		}
	}
}
