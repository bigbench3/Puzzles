package edu.elon.puzzles;

import java.util.ArrayList;

public class Doors {
	static String open = "open";
	static String close = "close";
	
	public static void main(String [ ] args){
		String[] doors = createDoors();
		solve(doors);
//		int doorsOpen = solve(doors);
//		System.out.println("Number of doors open: " + doorsOpen);
	}
	
	public static String[] createDoors(){
		String[] doors = new String[100];	
		
		for(int i = 0; i < 100; i++){
			doors[i] = close;
		}
		
		return doors;
	}
	
	public static void solve(String[] doors){
		int round = 0;
		
		for(int i = 0; i < 100; i++){
			int doorsOpen = 0;
			
			for(int j = 0; j < doors.length; j++){
				if(doors[j].equals(close)){
					doors[j] = open;
				} else{
					doors[j] = close;
				}
				
				j = j + round;
			}
			
			for(int k = 0; k < doors.length; k++){
				if(doors[k].equals(open)){
					doorsOpen++;
				}
			}
			
			System.out.println("On round " + round + " there are " + doorsOpen + " doors open");
			round++;
		}
		
	}
	
}
