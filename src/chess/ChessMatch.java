package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
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

}
