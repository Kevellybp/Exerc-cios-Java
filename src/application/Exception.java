package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entities.Reservation;

public class Exception {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number: ");
		int number = sc.nextInt();

		System.out.println("Chek-in date (dd/MM/yyyy)");
		Date checkIn = (Date) sdf.parse(sc.next());

		System.out.println("Chek-out date (dd/MM/yyyy)");
		Date checkOut = (Date) sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("ERROR in reservation: Check-out date must be afater check- in date");
		} else {

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println(); 

			System.out.println("Enter data to update the reservation");
			System.out.println("Chek-in date (dd/MM/yyyy)");
			checkIn = (Date) sdf.parse(sc.next());

			System.out.println("Chek-out date (dd/MM/yyyy)");
			checkOut = (Date) sdf.parse(sc.next());


				 String error = reservation.updateDates(checkIn, checkOut);
				 if (error != null) {
					System.out.println("Error in reservation : " + error); 
				 } else {
						System.out.println(reservation);
				 }
		}}}			

