public class BoardToTextConverter {
    public String convertToText(Board ourBoard){
        // The method shouldn't be static; we want to override it later in subclasses
        int height = ourBoard.getHeight(); //the getter has to be static to work?
        int width = ourBoard.getWidth();
        //SquareType[][] squares = new SquareType[height][width];
        StringBuilder builder = new StringBuilder();
        for (SquareType[] squareRow:ourBoard.squares) {
            builder.append("\n");
            for (SquareType square:squareRow) {
                switch (square){
                    case EMPTY:
                        builder.append(" ");
                        break;
                    case I:
                        builder.append("I");
                        break;
                    case J:
                        builder.append("J");
                        break;
                    case L:
                        builder.append("L");
                        break;
                    case O:
                        builder.append("O");
                        break;
                    case S:
                        builder.append("S");
                        break;
                    case T:
                        builder.append("T");
                        break;
                    case Z:
                        builder.append("Z");


                }
            }
        }
        String returnString = builder.toString();

        return returnString;
    }
}
