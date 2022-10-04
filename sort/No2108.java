package kr.or.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No2108 {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		for(int num : list) {
			sum += num;
		}
		System.out.println(list);
		
		System.out.println((long)Math.round(sum/(double)list.size()));
		System.out.println(list.get(list.size()/2));
		System.out.println(mode(list) - 4000);
		System.out.println(Collections.max(list) - Collections.min(list));

	}

	public static int mode(ArrayList<Integer> list) {
		int[] arr = new int[8001];
		
		int max = 0;
		int count = 0;
		
		for(int num : list) {
			arr[num+4000]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[max] <= arr[i]) max = i;
			else arr[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(count == 2) {
				max = i;
				break;
			}
			if(arr[i] == arr[max]) count++;
		}
		
		return max;
	}
	
	

}
