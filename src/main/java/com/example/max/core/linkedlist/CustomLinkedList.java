package com.example.max.core.linkedlist;

public class CustomLinkedList<T> implements CustomList<T>{

    private Node<T> first;
    private Node<T> last;
    private Integer size = 0;

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value, null, first);
        if (size == 0) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        first = newNode;
        size++;
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value, last, null);
        if (size == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public void add(T value) {
        findLast(value);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) return null;

        Node<T> removed = first;
        size--;
        first = first.next;
        if (size != 0) {
            first.previous = null;
        }
        removed.next = null;


        return removed.value;
    }
    private boolean isEmpty() {
        return size == 0;
    }
    @Override
    public T removeLast() {
        if (isEmpty()) return null;
        size--;
        Node<T> removed = last;
        last = last.previous;
        if (size != 0) {
            last.next = null;
        }
        removed.previous = null;

        return removed.value;
    }

    @Override
    public T getFirst() {
        return first.value;
    }

    @Override
    public T getLast() {
        return last.value;
    }

    @Override
    public boolean contains(T value) {
        Node<T> current = first;

        if (current.next != null) {
            if (current.value.equals(value)) return true;
            current = current.next;
        }

        return false;
    }
    private void findLast(T obj) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(obj, l, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "first=" + first.value +
                ", last=" + last.value +
                ", size=" + size +
                '}';
    }
}
