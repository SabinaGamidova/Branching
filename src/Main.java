import figures.Circle;
import figures.Figure;
import figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(3, 6);
        figure.printCenter();
        Figure figure1 = new Circle(1, 2, 5);
        figure1.printCenter();
        Rectangle rectangle = new Rectangle(1,2,3,4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

    }
}
