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
        {
            elementos.add(elemento); //??
        }

    }

    @Override
    public E pop() {
        if (elementos.isEmpty()) {
            return null;
        }
        E elemento = elementos.get(size() - 1);
        this.elementos.remove(size() - 1);
        return elemento;
    }


    public E peek() throws RuntimeException {

        if (this.isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return this.elementos.get(size() - 1);

    }

    @Override
    public int size() {
        return this.elementos.size();
    }


    @Override
    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pilha{" + elementos +

                '}';
    }
}