import interfaces.Pilha;

import java.util.ArrayList;
import java.util.List;

public class PilhaImpl<E> implements Pilha<E> {

    private final List<E> pilha;

    public PilhaImpl() {
        this.pilha = new ArrayList<E>();
    }

    @Override
    public void push(E elemento) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() throws Exception {
        return null;
    }

    @Override
    public int size() {
        return this.pilha.size();
    }

    @Override
    public boolean isEmpty() {
        return this.pilha.isEmpty();
    }
}
