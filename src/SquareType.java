import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum SquareType {
    EMPTY, I, J, L, O, S, T, Z;

    private static final List<SquareType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static SquareType randomSquareType()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static void main(String[] args){
        Board testBoard = new Board(10,5);
        BoardTester bT = new BoardTester();
        bT.generateTestBoard(testBoard);
        return;

    }

}
