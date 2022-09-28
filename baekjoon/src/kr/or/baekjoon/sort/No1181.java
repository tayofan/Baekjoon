package kr.or.baekjoon.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class No1181 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < n; i++) {
        	set.add(scan.nextLine());
        }
        
        ArrayList<String> list = new ArrayList<String>(set);
        Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				else if(o1.length() < o2.length()) return -1;
				else {
					return o1.compareTo(o2);
				}
			}
		});
        
        for(String str:list) {
        	System.out.println(str);
        }
        

	}

}
