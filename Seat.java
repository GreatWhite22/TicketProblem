package assignment6;


public class Seat {
	private int seatNumber;
	private char row;
	private boolean occupied;
	
	public Seat(int number, int rowNumber){
		this.seatNumber = number;
		this.row = (char)(rowNumber * 65);
		this.occupied = false;
	}
	
	public boolean isReserved(){
		return this.occupied;
	}
	
	public void markAvailableSeatTaken(){
		this.occupied = true;
	}
	
	public void printTicketSeat(){
		System.out.println(this.row + " " + this.seatNumber + " was sold");
	}
}