package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("AVAILABLE ROOMS: 1 to 9");
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		for (int i = 1; i <= quantity; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine(); // Buffer cleaner
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
