package server;

public abstract class Board {
	
	private Figure arrOfFig [][];

	public Figure[][] getArrOfFig() {
		return arrOfFig;
	}

	public void setArrOfFig(Figure[][] arrOfFig) {
		this.arrOfFig = arrOfFig;
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

}
