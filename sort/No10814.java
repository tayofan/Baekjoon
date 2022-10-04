package kr.or.baekjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No10814 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Person[] arr = new Person[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new Person(scan.nextInt(), scan.nextLine());
		}
		
		Arrays.sort(arr, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
			
		});
		
		for(Person p : arr) {
			System.out.println(p);
		}
	}

	public static class Person {
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + "" + name;
		}
	}
}

