package com.Codealpha.dto;

public class Room {
	    private int roomNumber;
	    private String guestName;
	    private boolean occupied;
	    public Room(int roomNumber) {
	        this.roomNumber = roomNumber;
	        this.guestName = "";
	        this.occupied = false;
	    }
	    public int getRoomNumber() {
	        return roomNumber;
	    }
	    public String getGuestName() {
	        return guestName;
	    }
	    public void setGuestName(String guestName) {
	        this.guestName = guestName;
	    }
	    public boolean isOccupied() {
	        return occupied;
	    }
	    public void setOccupied(boolean occupied) {
	        this.occupied = occupied;
	    }
	    @Override
	    public String toString() {
	        return "\tRoom " + roomNumber + ": " + (occupied ? "Occupied by " + guestName : "Available");
	    }
	}
