
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {

            // place number
            square.placeValue(row, col, num);

            // store current position (in case next move is invalid)
            int nextRow = (row - 1 + size) % size; // move up (wrap around top)
            int nextCol = (col + 1) % size;        // move right (wrap around right)

            // if next cell is already filled, move down instead
            if (square.readValue(nextRow, nextCol) != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }

}
