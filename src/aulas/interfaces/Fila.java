package interfaces;

public interface Fila <E> {

    void add(E element);
    E peek();
    E pool();
    int size();
    boolean isEmpty();

}
