package day17;

public class Task1 {

	public static void main(String[] args) {
		ChessPiece[] array = {ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN,
				ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN,
				ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK,
				ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK};

		for (ChessPiece chessPiece : array) {
			System.out.print(chessPiece + " ");
		}
	}
}