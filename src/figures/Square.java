package figures;

public class Square extends Figure{
    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int calculateArea(){
        return side * side;
    }

    public int calculatePerimeter(){
        return side * 4;
    }
}
