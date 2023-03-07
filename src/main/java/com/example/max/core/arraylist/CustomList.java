package com.example.max.core.arraylist;

public interface CustomList<T> {
    int size();
    int indexOf(T obj);
    boolean isEmpty();
    void add(T value);
    void add(int index, T value);
    T get(int index);
    void remove(int index);

}
