package kr.or.baekjoon.sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class No18870 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] sort = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			sort[i] = arr[i];
		}
		
		Arrays.sort(sort);
		
		int rank = 0;
		
		for(int num : sort) {
			if(!map.containsKey(num)) {
				map.put(num, rank);
				rank++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = map.get(arr[i]);
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);	
	}
}

// 나의 풀이 => 시간 초과
//public class No18870 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		String nums = br.readLine();
//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(nums.split(" ")[i]);
//			set.add(arr[i]);
//		}
//		
//		ArrayList<Integer> list = new ArrayList<Integer>(set);
//		
//		Collections.sort(list);
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = list.indexOf(arr[i]);
//			bw.write(arr[i] + " ");
//		}
//		bw.flush();
//	}
//}
