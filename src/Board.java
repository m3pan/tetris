import java.util.Random;

public class Board {
    public SquareType[][] squares;
    private int height;
    private int width;
    private final static Random rnd = new Random();
    public void replaceContent(){
        int n = rnd.nextInt(50);
        System.out.println(n);
    }
    public Board(int height, int width){
        this.height = height;
        this.width = width;
        this.squares = new SquareType[height][width]; //!? why do I have to write new?
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.squares[i][j] = SquareType.randomSquareType();
            }
        }
    }
    public int getHeight(){

        return height;
    }
    public int getWidth(){

        return width;
    }
    public SquareType getSquareType (int x, int y){

        return squares[x][y];
    }

}
