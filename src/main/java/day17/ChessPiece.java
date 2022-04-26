package day17;

public enum ChessPiece {
	WHITE_KING("\u2654", 100),
	WHITE_QUEEN("\u2655", 9),
	WHITE_ROOK("\u2656",5),
	WHITE_BISHOP("\u2657",3.5),
	WHITE_KNIGHT("\u2658",3),
	WHITE_PAWN("\u2659",1),
	BLACK_KING("\u265A", 100),
	BLACK_QUEEN("\u265B", 9),
	BLACK_ROOK("\u265C",5),
	BLACK_BISHOP("\u265D",3.5),
	BLACK_KNIGHT("\u265E",3),
	BLACK_PAWN("\u265F",1),
	EMPTY("_", -1);
	

	private final String symbol;
	private final double value;
	
	ChessPiece(String symbol, double value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
}
