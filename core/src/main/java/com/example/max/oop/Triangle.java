package com.example.max.oop;

public class Triangle extends Figure {


    public Triangle(Integer size) {
        super(size);
    }

    @Override
    public void getSize() {
        System.out.println("Треугольнику присвоен размер " + size);
    }
}
