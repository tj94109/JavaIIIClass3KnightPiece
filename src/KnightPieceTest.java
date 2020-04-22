import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightPieceTest {


    @Test
    void moveTo() {
        KnightPiece n = new KnightPiece();
        n.chessBoard = new int[4][4];
        n.moveTo(2,1);
        assertEquals(n.x = 2, 2);
        assertEquals(n.y = 1, 1);
        assertTrue(n.isValid(0,3,1,1));
    }

    @Test
    void reset() {
        KnightPiece n2 = new KnightPiece();
        n2.chessBoard = new int[4][4];
        n2.reset();
        assertEquals(n2.x = 0, 0);
        assertEquals(n2.y = 0, 0);
    }
}