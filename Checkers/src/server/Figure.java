package server;

public abstract class Figure {

	private boolean color;// false = black
						  //true - white
	private boolean status;//false - ordinary 
							//true - queen
	private int coordinate;
	
	public int getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(int coordinate) {
		this.coordinate = coordinate;
	}

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Figure() {
		// TODO Auto-generated constructor stub
	}

}
