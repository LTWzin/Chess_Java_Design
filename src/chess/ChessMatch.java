package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		 ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		 
		 for (int i=0;i<board.getRows();i++) {
			 for (int ii=0;ii<board.getColumns();ii++) {
				 matriz[i][ii] = (ChessPiece) board.piece(i, ii);
			 }
		 }
		 return matriz;
	}

	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
	
}
