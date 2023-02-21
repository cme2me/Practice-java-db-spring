import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(5);

        Figure triangle = new Triangle(10);

        Figure circle = new Circle(1);

        List<Figure> figures = Arrays.asList(square, triangle, circle);
        for (Figure figure : figures) {
            figure.getSize();
        }
    }
}
