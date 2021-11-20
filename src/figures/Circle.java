package figures;

public class Circle extends Figure {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateLength(){
        return 2 * Math.PI * radius;
    }
}
