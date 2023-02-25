package oop;

public abstract class Figure {
    public Integer size;

    public Figure(Integer size) {
        this.size = size;
    }

    public void getSize() {
        System.out.println("Размер рандомной фигуры = " + size);
    }
}
