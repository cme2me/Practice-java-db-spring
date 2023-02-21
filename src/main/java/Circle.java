public class Circle extends Figure{
    public Circle(Integer size) {
        super(size);
    }

    @Override
    public void getSize() {
        System.out.println("Кругу присвоен размер " + size);
    }
}
