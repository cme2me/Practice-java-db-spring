public abstract class Figure {
    private String name;

    public void setSize(Integer size) {
        System.out.println("Фигуре " + name + " присвоен размер " + size);
    }

    public void setName(String name) {
        this.name = name;
    }
}
