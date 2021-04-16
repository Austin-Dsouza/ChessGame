package main.pieces;

import main.components.Board;
import main.components.Position;

public class King extends Piece {

	public King(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position start, Position end) {

		if (end.getPiece() != null && start.getPiece().getColor() == end.getPiece().getColor())
			return false;
		// check if possible

		// check for check

		return false;
	}

	private boolean isCheck(Board board, Position destination) {
		// Need to check if the king is moving into a chess position

		return false;
	}

}
