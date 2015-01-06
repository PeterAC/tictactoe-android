package com.example.tictactoe;

public class Game {

	boolean[][] myGame = new boolean[3][3];
	
	public Game()
	{
		clearGame();
	}
	
	public void clearGame(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				myGame[i][j] = false;
			}
		}
	}
	
	public boolean hasWon() {
		boolean status = false;
		if (
				(myGame[0][0] && myGame[0][1] && myGame[0][2]) || (myGame[1][0] && myGame[1][1] && myGame[1][2]) || 
				(myGame[2][0] && myGame[2][1] && myGame[2][2]) || (myGame[0][0] && myGame[1][0] && myGame[2][0]) || 
				(myGame[0][1] && myGame[1][1] && myGame[2][1]) || (myGame[0][2] && myGame[1][2] && myGame[2][2]) || 
				(myGame[0][0] && myGame[1][1] && myGame[2][2]) || (myGame[0][2] && myGame[1][1] && myGame[2][0])
				) {
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
}
