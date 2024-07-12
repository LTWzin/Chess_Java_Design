package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0;i<pieces.length;i++) {	
			System.out.print((8 - i) + " ");
			for (int ii=0;ii<pieces.length;ii++) {
				printPiece(pieces[i][ii]);
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print('-');
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}