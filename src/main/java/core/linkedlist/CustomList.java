package core.linkedlist;

public interface CustomList<T> {
    void addFirst(T value);
    void addLast(T value);
    void add(T value);
    T removeFirst();
    T removeLast();
    T getFirst();
    T getLast();
    boolean contains(T value);
}
