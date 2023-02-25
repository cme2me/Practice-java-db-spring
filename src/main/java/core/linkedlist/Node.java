package core.linkedlist;

public class Node<T> {
    public T value;
    public Node<T> previous;
    public Node<T> next;

    public Node(T value, Node<T> previous, Node<T> next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
