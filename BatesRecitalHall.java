package assignment6;

//import java.util.*;

public class BatesRecitalHall {
	int rows = 27;
	int columns = 28;
	Seat[][] seats;
	int reservations;
	
	public BatesRecitalHall(){
		for(int i = 0; i < columns; i++){
			for(int j = 0; j < rows; j++){
				seats[i][j] = new Seat(i, j);
			}
		}
	}
	
	public Seat bestAvailable(){
		for(int i = 0; i < 13; i++){
			for(int j = 7; j < 21; j++){
				if(!seats[i][j].isReserved()){
					seats[i][j].markAvailableSeatTaken();
					seats[i][j].printTicketSeat();
					return seats[i][j];
				}
			}
		}
		for(int i = 0; i < 13; i++){
			for(int j = 0; j < 7; j++){
				if(!seats[i][j].isReserved()){
					return seats[i][j];
				}
			}
			for(int k = 21; k < 28; k++){
				if(!seats[i][k].isReserved()){
					return seats[i][k];
				}
			}
		}
		for(int i = 13; i < 26; i++){
			for(int j = 7; j < 21; j++){
				if(!seats[i][j].isReserved()){
					return seats[i][j];
				}
			}
		}
		for(int i = 13; i < 26; i++){
			for(int j = 0; j < 7; j++){
				if(!seats[i][j].isReserved()){
					return seats[i][j];
				}
			}
			for(int k = 21; k < 28; k++){
				if(!seats[i][k].isReserved()){
					return seats[i][k];
				}
			}
		}
		System.out.println("sorry, we are sold out");
		return null;
	}
}
