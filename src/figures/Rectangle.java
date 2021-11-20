package figures;

public class Rectangle extends Figure{
    private int sideA;
    private int sideB;

    public Rectangle(int x, int y, int sideA, int sideB) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int calculateArea(){
        return sideA * sideB;
    }

    public int calculatePerimeter(){
        return 2 * (sideA + sideB);
    }
}
