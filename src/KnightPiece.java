import java.util.Arrays;

public class KnightPiece {

    public static final int n = 4;
    protected static int[][] chessBoard;
    //private static int p = n-1;

    protected static int x = 0;
    protected static int y = 0;


    public static void main(String[] args) {
        chessBoard = new int[n][n];
        System.out.println("First");
        reset();
        printChessBoard();
        //printCoordinates();

        System.out.println("\nSecond");
        moveTo(1, 2);
        printChessBoard();

        System.out.println("\nThird");
        moveTo(3,1);
        printChessBoard();

        System.out.println("\nFourth");
        moveTo(-2,-2);
        printChessBoard();



    }
    public static void printChessBoard(){

        for (int[] row : chessBoard) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    static void printCoordinates(){
        System.out.println("\nx = "+ x + "\ny = " + y +"\n");
    }

    public static void moveTo(int x, int y) {
        System.out.println("Move to x = "+ x + ", y = " + y);
        if(isValid(KnightPiece.x, KnightPiece.y, x, y)){
            KnightPiece.x = x;
            KnightPiece.y = y;
            chessBoard[y][x] = 2;
            System.out.println();
        }else{
            System.out.println("illegal move\n");
            reset();
        }
    }

    public static void reset() {
        Arrays.stream(chessBoard).forEach(x -> Arrays.fill(x, 0));
        chessBoard[0][0] = 1;
        KnightPiece.x = 0;
        KnightPiece.y = 0;
        System.out.println("RESET\n" + "x = 0" + "\ny = 0\n" );
    }



    static boolean isValid(int startX, int startY,  int endX, int endY){
        int deltaX = startX - endX;
        int deltaY = startY - endY;
        return (5 == deltaX * deltaX + deltaY * deltaY && (1 <= startX + endY && startX + endY <= n));
    }//


}
