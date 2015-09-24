package server;

import java.util.ArrayList;

public interface Server {

	public void StartGame();

	public void StartGame(Board startBoard);

	public Board getCurrentStatus();
	
	public ArrayList<ArrayList<Step>> getAllStatuses(Board board);
	
	public boolean isGameEnd();
	
	public boolean isWeWon();
	
	public int roadPrice();
	
	public void userStep(ArrayList<Step> road);
}
