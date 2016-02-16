package Tetris;

public class Board {

    private SquareType[][] squares;
    private int width;
    private int height;

    public Board(final int width, final int height) {
        this.width = width;
        this.height = height;

        squares = new SquareType[height][width];

	for (int row = 0; row < height; row++){
	    for (int col = 0; col < width; col++){
		squares[row][col] = SquareType.EMPTY;
	    }
	}
    }

    public static void main(String[] args) {
	Board board = new Board(10, 10);

    }


}
