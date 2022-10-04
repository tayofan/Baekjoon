package kr.or.baekjoon.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] nos = new String[m];

		for(int i = 0; i < n; i++) {
			map.put(br.readLine(),i);
		}
		for(int i = 0; i < m; i++) {
			nos[i] = br.readLine();
		}
		Arrays.sort(nos);
		
		for(String str : nos) {
			if(map.containsKey(str)) {
				sb.append(str + "\n");
				cnt++;
			}
			if(cnt == nos.length) break;
		}
		
		sb.insert(0, cnt+"\n");
		
		System.out.println(sb);
	}

}
