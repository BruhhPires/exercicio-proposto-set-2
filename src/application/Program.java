package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<User> user = new HashSet<>();
		
		System.out.print("How many students for a course A? ");
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			int code = sc.nextInt();
			user.add(new User(code));
		}
		
		System.out.print("How many students for a course B? ");
		int b = sc.nextInt();
		for (int i=0; i<b; i++) {
			int code = sc.nextInt();
			user.add(new User(code));
		}
		
		System.out.print("How many students for a course C? ");
		int c = sc.nextInt();
		for (int i=0; i<c; i++) {
			int code = sc.nextInt();
			user.add(new User(code));
		}
		
		System.out.println("Total students: " + user.size());
							
		sc.close();
	}

}
