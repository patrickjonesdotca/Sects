package ca.pjones.sects;

public class Game {
	
	private Move[] moves;
	private boolean inGame;
	private Player firstPlayer;
	private Player secondPlayer;
	private boolean isFinished;
	
	public Move[] getMoves() {
		return moves;
	}

	public void setMoves(Move[] moves) {
		this.moves = moves;
	}

	public boolean isInGame() {
		return inGame;
	}

	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}

	public Player getfirstPlayer() {
		return firstPlayer;
	}

	public void setfirstPlayer(Player firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public Player getsecondPlayer() {
		return secondPlayer;
	}

	public void setsecondPlayer(Player secondPlayer) {
		this.secondPlayer = secondPlayer;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Game() {}

}
