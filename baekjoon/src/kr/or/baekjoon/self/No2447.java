package kr.or.baekjoon.self;

import java.util.Scanner;

public class No2447 {
	static int count = 0;

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	int t = Integer.parseInt(scan.nextLine());
    	
    	int[][] cnt = new int[t][2];
    	String[] str = new String[t];
    	for(int i = 0; i < t; i++) {
    		str[i] = scan.nextLine();
    		cnt[i][0] = isPalindrome(str[i]);
    		cnt[i][1] = count;
    		count = 0;
    	}
    	
    	for(int i = 0; i < t; i++) {
    		sb.append(cnt[i][0]+ " " +cnt[i][1] + "\n");
    	}
    	System.out.println(sb);
    }
    
    public static int recursion(String s, int l, int r){
    	count++;
    	if(l >= r) return 1;
    	else if(s.charAt(l) != s.charAt(r)) return 0;
    	else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
    	return recursion(s, 0, s.length()-1);
    }

}
