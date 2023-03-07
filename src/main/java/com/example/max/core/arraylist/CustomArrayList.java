package com.example.max.core.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

    private final int DEFAULT_SIZE = 10;

    private Integer size = 0;
    private T[] arr = (T[]) new Object[DEFAULT_SIZE];

    private void ensureCapacity() {
        if (arr.length >= (float) arr.length/100 * 0.75) {
            int newLength = (arr.length * 2) + 1;
            arr = Arrays.copyOf(arr, newLength);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T obj) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == obj) return i;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(T value) {
        arr[size] = value;
        size++;
        ensureCapacity();
    }

    @Override
    public void add(int index, T value) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T replacedValue = arr[index];
        arr[index] = value;
        size++;
        if (size == arr.length) {
            ensureCapacity();
        }
        for (int i = index + 1; i <= size; i++) {
            T temp = arr[i];
            arr[i] = replacedValue;
            replacedValue = temp;
        }
    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public void remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();

        for (int i = index; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
