public class BoardTester {
    public void generateTestBoard(Board testBoard){
        //!? Is this how you should do to use a function in a different class?
        BoardToTextConverter converter = new BoardToTextConverter();
        String testBoardString = converter.convertToText(testBoard);
        System.out.println(testBoardString);

        for (SquareType[] squareRow:testBoard.squares) {
            for (SquareType square:squareRow) {
                //Prints out the type
                System.out.println(square);
            }
        }


    }
}
