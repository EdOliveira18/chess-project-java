package chess;

import boardgame.Board;
import boardgame.Pierce;

public class ChessPiece extends Pierce{
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
