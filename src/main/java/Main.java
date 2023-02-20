public class Main {
    public static void main(String[] args) {
        Figure square = new Square();

        square.setName("Square");
        square.setSize(5);

        Figure triangle = new Triangle();
        triangle.setName("Triangle");
        triangle.setSize(10);

        Figure circle = new Circle();
        circle.setName("Circle");
        circle.setSize(1);
    }
}
