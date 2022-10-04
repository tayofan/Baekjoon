package kr.or.baekjoon.math1;

import java.io.IOException;
import java.util.Scanner;

public class No10757 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//        String str = br.readLine();
//		String a = str.split(" ")[0];
//		String b = str.split(" ")[1];
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		int max = Math.max(a.length(), b.length());
		
		int[] A = new int[max + 1];
		for(int i = 0; i < a.length(); i++) {
			A[i] = a.charAt(a.length() - 1 - i) - '0';
		}
		
		int[] B = new int[max + 1];
		for(int i = 0; i < b.length(); i++) {
			B[i] = b.charAt(b.length() - 1 - i) - '0';
		}
		
		for(int i = 0; i < A.length-1; i++) {
			int sum = A[i] + B[i];
			A[i] = sum%10;
			A[i+1] += sum/10;
		}
		
//		for(int i = A.length - 1; i >= 0; i--) {
//			bw.write(A[i] + "");
//		}
//        bw.flush();
        for(int i = A.length - 1; i >= 0; i--) {
        	System.out.print(A[i]);
        }
	}

}
