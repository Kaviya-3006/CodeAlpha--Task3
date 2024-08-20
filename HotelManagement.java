package com.Codealpha.dto;

import java.util.Scanner;

public class HotelManagement {
	    public static void main(String[] args) {
	        // Create an array of rooms
	        Room[] rooms = {
	            new Room(501),
	            new Room(502),
	            new Room(503),
	            new Room(504),
	            new Room(505),
	            new Room(506),
	            new Room(507),
	            new Room(508),
	            new Room(509),
	            new Room(510),
	        };
	        // Create a hotel object
	        Hotel hotel = new Hotel("Spiders Hotel", rooms);
	        Scanner scanner = new Scanner(System.in);
	        // Display menu and handle user input
	        while (true) {
	        	System.out.println("\t------------------------------");
	            System.out.println("\t|   Hotel Management System   |");
	            System.out.println("\t-------------------------------");
	            System.out.println("\n\tLimited rooms only available\n\tRoom number starts from 501 to 510");
	            System.out.println("\t1. Check-in");
	            System.out.println("\t2. Check-out");
	            System.out.println("\t3. View available rooms");
	            System.out.println("\t4. Exit");
	            System.out.print("\tEnter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    hotel.checkIn();
	                    System.out.println();
	                    break;
	                case 2:
	                    hotel.checkOut();
	                    System.out.println();
	                    break;
	                case 3:
	                    hotel.displayAvailableRooms();
	                    System.out.println();
	                    break;
	                case 4:
	                    System.out.println("\t------Thank you for applying this Application-----\n");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("\tInvalid choice.....\n\tEnter a Valid Number\n");
	            }
	        }
	    }
	}
