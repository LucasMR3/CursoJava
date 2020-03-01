package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class RentRoomsProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int numberOfRooms = sc.nextInt();
		sc.nextLine();

		Room[] rooms = new Room[10];
		for (int renter = 0; renter < numberOfRooms; renter++) {
			System.out.printf("\nRent #%d:\n", renter);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();

			int roomAvailable = 0;
			while (roomAvailable == 0) {
				System.out.print("Room: ");
				int roomNumber = sc.nextInt();
				sc.nextLine();
				if (rooms[roomNumber] == null) {
					rooms[roomNumber] = new Room(name, email);
					roomAvailable = 1;
				} else {
					System.out.println("Busy room! Try another.");
				}
			}
		}

		System.out.printf("\nBusy rooms: \n");
		for (int i = 0; i < rooms.length; i++)
			if (rooms[i] != null)
			System.out.println(i + rooms[i].toString());

		sc.close();
	}
}