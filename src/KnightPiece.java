import java.util.Arrays;

public class KnightPiece {

    public static final int n = 8;
    private static int[][] chessBoard;

    public static void main(String[] args) {

        chessBoard = new int[n][n];
        moveTo(2, 1);

        //reset();

        for (int[] row : chessBoard) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    public static void moveTo(int x, int y) {
        chessBoard[y][x] = 1;
    }

    public static void reset() {
        Arrays.stream(chessBoard).forEach(x -> Arrays.fill(x, 0));
    }
}
