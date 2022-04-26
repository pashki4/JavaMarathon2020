package day17;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		ChessPiece[][] chess = {{ChessPiece.BLACK_ROOK, ChessPiece.EMPTY,
				ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
				ChessPiece.BLACK_ROOK, ChessPiece.BLACK_KING, ChessPiece.EMPTY},
				{ChessPiece.EMPTY, ChessPiece.WHITE_ROOK, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.BLACK_PAWN,
						ChessPiece.BLACK_PAWN, ChessPiece.EMPTY,
						ChessPiece.BLACK_PAWN},
				{ChessPiece.BLACK_PAWN, ChessPiece.EMPTY,
						ChessPiece.BLACK_KNIGHT, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.BLACK_PAWN, ChessPiece.EMPTY},
				{ChessPiece.BLACK_QUEEN, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.WHITE_BISHOP, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
				{ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.BLACK_BISHOP, ChessPiece.WHITE_PAWN,
						ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
				{ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.WHITE_BISHOP,
						ChessPiece.WHITE_PAWN, ChessPiece.EMPTY,
						ChessPiece.EMPTY},
				{ChessPiece.WHITE_PAWN, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.WHITE_QUEEN, ChessPiece.EMPTY,
						ChessPiece.WHITE_PAWN, ChessPiece.EMPTY,
						ChessPiece.WHITE_PAWN},
				{ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.WHITE_ROOK, ChessPiece.WHITE_KING,
						ChessPiece.EMPTY}};
		ChessBoard board = new ChessBoard(chess);
		board.print();
	}
}
