package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entities.Reservation;
import Model.entities.exceptions.DomainException;

public class Exception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			try {
			System.out.println("Room number: ");
			int number = sc.nextInt();
			System.out.println("Chek-in date (dd/MM/yyyy)");
			Date checkIn = (Date) sdf.parse(sc.next());
			System.out.println("Chek-out date (dd/MM/yyyy)");
			Date checkOut = (Date) sdf.parse(sc.next());
		
		
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println(); 
		
			System.out.println("Enter data to update the reservation");
			System.out.println("Chek-in date (dd/MM/yyyy)");
			checkIn = (Date) sdf.parse(sc.next());
		
			System.out.println("Chek-out date (dd/MM/yyyy)");
			checkOut = (Date) sdf.parse(sc.next());
		
		
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
			}
			catch (ParseException e ) {
				System.out.println("Invalid date format");
			}
			catch (DomainException e) {
				System.out.println("Error in reservation "+ e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Unexpected error");
			}
		 }
		}		

