package main.components;

public class Board {

	Position[][] chessGrid;

	public Board() {
		resetBoard();
	}

	public void resetBoard() {
		this.chessGrid = new Position[8][8];

	}

	public Position getBox(int x, int y) throws Exception {

		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new Exception("Invalid Position");
		}

		return this.chessGrid[x][y];
	}

}
