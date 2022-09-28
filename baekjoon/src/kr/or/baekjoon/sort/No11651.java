package kr.or.baekjoon.sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No11651 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
        	
        	arr[i][1] = scan.nextInt();
        	arr[i][0] = scan.nextInt();
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
        	
        	
		});
        
        
        for(int i=0; i<n; i++){
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }

	}

}
