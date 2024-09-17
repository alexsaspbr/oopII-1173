package interfaces;

public interface Pilha<E> {

    void push(E elemento);
    E pop();
    E peek() throws Exception;
    int size();
    boolean isEmpty();

}
