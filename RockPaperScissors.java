package com.Revature.RockPaperScissors;

public class RockPaperScissors {
	
	public static void rps(String input1, String input2) {
		
		String result = "";
		
		if(input1 == "rock" && input2 == "paper") {
			result = "Player 2 wins";
		} else if (input1 == "paper" && input2 == "rock") {
			result = "Player 1 wins";
		}
		
		if(input1 == "paper" && input2 == "scissors") {
			result = "Player 2 wins";
		} else if(input1 == "scissors" && input2 == "paper") {
			result = "Player 1 wins";
		}
		
		if(input1 == "scissors" && input2 == "rock") {
			result = "Player 2 wins";
		} else if(input1 == "rock" && input2 == "scissors") {
			result = "Player 1 wins";
		}
		
		if(input1 == input2) {
			result = "TIE";
		}
		
		System.out.println(result);
	}
	
	public static class Main {
		
		public static void main(String[] args) {
			
			rps("rock", "rock");
			rps("rock", "paper");
			rps("paper", "rock");
			rps("paper", "scissors");
			rps("scissors", "scissors");
			rps("scissors", "paper");
		}
	}
	

}
