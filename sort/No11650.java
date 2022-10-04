package kr.or.baekjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class No11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
        	String a[] = br.readLine().split(" ");
        	arr[i][0] = Integer.parseInt(a[0]);
        	arr[i][1] = Integer.parseInt(a[1]);
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
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.flush();

	}

}
