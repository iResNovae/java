package chess_engine;

public abstract class MainClass {
static int coordIntI;
static int coordIntJ;
static String coordStringI;
static String coordStringJ;
	public static void main(String[] args) {
		Board boardObject = new Board();
		King kingObject = new King();
		for (int i = 0; i < 25; i++){ 
		coordIntI = kingObject.move(coordStringI);
		coordIntJ = kingObject.move(coordStringJ);
		coordStringI = Integer.toString(coordIntI);
		coordStringJ = Integer.toString(coordIntJ);
		boardObject.showBoard(coordStringI,coordStringJ);
	}
	}
}
