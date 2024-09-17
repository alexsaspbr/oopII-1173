import interfaces.Pilha;

import java.util.ArrayList;
import java.util.List;

public class PilhaImpl<E> implements Pilha<E> {

    private final List<E> elementos;


    // construtor
    public PilhaImpl() {

        this.elementos = new ArrayList<E>();
    }


    // metodos
    @Override
    public void push(E elemento) {

    }

    @Override
    public E pop() {
        return null;
    }


    public E peek() throws RuntimeException {
        return null;
    }

    @Override
    public int size() {
        return this.elementos.size();
    }


    @Override
    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

}