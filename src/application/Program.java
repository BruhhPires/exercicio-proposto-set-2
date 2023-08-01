package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for a course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int code = sc.nextInt();
			a.add(code);
		}
		
		System.out.print("How many students for a course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int code = sc.nextInt();
			c.add(code);
		}
		
		System.out.print("How many students for a course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int code = sc.nextInt();
			c.add(code);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
							
		sc.close();
	}

}
