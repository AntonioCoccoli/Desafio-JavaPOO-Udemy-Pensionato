package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent vect[] = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=rooms; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Rent(name, email, room);
		}
		
		for (int i=0; i<vect.length; i++ ) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}
