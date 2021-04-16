package main.pieces;

import main.components.Board;
import main.components.Position;

public abstract class Piece {

	private PieceColor color;
	private boolean killed;

	public Piece(PieceColor color) {
		this.color = color;
	}

	public PieceColor getColor() {
		return this.color;
	}

	public boolean isKilled() {
		return this.killed;
	}

	public void kill() {
		this.killed = true;
	}

	public abstract boolean canMove(Board board, Position start, Position end);
}
