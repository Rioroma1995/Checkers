package server;

public abstract class Step {

	private int startPosition;
	private int endPosition;
	private boolean doesHit;
	
	public Step(int startPosition, int endPosition, boolean doesHit) {
		super();
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		this.doesHit = doesHit;
	}
	
	public int getStartPosition() {
		return startPosition;
	}
	
	public int getEndPosition() {
		return endPosition;
	}
	
	public boolean isDoesHit() {
		return doesHit;
	}	
}
