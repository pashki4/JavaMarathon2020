package day17;

public class Task1 {

	public static void main(String[] args) {
		ChessPiece[] array = new ChessPiece[8];
		for (int i = 0; i < 4; i++) {
			array[i] = ChessPiece.WHITE_PAWN;
			array[i] = ChessPiece.WHITE_PAWN;
			array[i] = ChessPiece.WHITE_PAWN;
			array[i] = ChessPiece.WHITE_PAWN;
		}
		for (int i = 4; i < 8; i++) {
			array[i] = ChessPiece.BLACK_ROOK;
			array[i] = ChessPiece.BLACK_ROOK;
			array[i] = ChessPiece.BLACK_ROOK;
			array[i] = ChessPiece.BLACK_ROOK;			
		}
		for (ChessPiece chessPiece : array) {
			System.out.print(chessPiece + " ");
		}
	}
}