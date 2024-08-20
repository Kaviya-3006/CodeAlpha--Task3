package com.Codealpha.dto;

import java.util.Scanner;

class Hotel {
	    private Room[] rooms;
	    public Hotel(String hotelName, Room[] rooms) {
	        this.rooms = rooms;
	    }
	    // Display available rooms in the hotel
	    public void displayAvailableRooms() {
	        System.out.println("\tAvailable Rooms:");
	        for (Room room : rooms) {
	            if (!room.isOccupied()) {
	                System.out.println(room);
	            }
	        }
	    }
	    // Check-in a guest to a room
	    public void checkIn() 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("\tEnter room number: ");
	        int roomNumber = scanner.nextInt();
	        // Find the room by its number
	        Room room = findRoom(roomNumber);
	        if (room != null) {
	            if (room.isOccupied()) {
	                System.out.println("\tRoom " + roomNumber + " is already occupied.");
	            } else {
	                System.out.print("\tEnter guest name: ");
	                String guestName = scanner.next();
	                room.setGuestName(guestName);
	                room.setOccupied(true);
	                System.out.println("\tGuest " + guestName + " checked into room " + roomNumber + ".");
	            }
	        } else {
	            System.out.println("\tRoom " + roomNumber + " does not exist.");
	        }
	    }
	    // Check-out a guest from a room
	    public void checkOut() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("\tEnter room number: ");
	        int roomNumber = scanner.nextInt();
	        // Find the room by its number
	        Room room = findRoom(roomNumber);
	        if (room != null) {
	            if (room.isOccupied()) {
	                String guestName = room.getGuestName();
	                room.setGuestName("");
	                room.setOccupied(false);
	                System.out.println("\tGuest " + guestName + " checked out of room " + roomNumber + ".");
	            } else {
	                System.out.println("\tRoom " + roomNumber + " is not occupied.");
	            }
	        } else {
	            System.out.println("\tRoom " + roomNumber + " does not exist.");
	        }
	    }
	    // Find a room by its number
	    private Room findRoom(int roomNumber) {
	        for (Room room : rooms) {
	            if (room.getRoomNumber() == roomNumber) {
	                return room;
	            }
	        }
	        return null;
    }
	}
