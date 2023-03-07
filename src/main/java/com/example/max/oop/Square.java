package com.example.max.oop;

public class Square extends Figure{
    public Square(Integer size) {
        super(size);
    }

    @Override
    public void getSize() {
        System.out.println("Квадрату присвоен размер " + size);
    }
}
