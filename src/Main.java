import figures.Circle;
import figures.Figure;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(3, 6);
        figure.printCenter();
        Figure figure1 = new Circle(1, 2, 5);
        figure1.printCenter();
    }
}
