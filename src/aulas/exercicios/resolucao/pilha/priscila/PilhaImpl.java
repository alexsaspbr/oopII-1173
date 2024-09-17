package exercicios.resolucao.pilha.priscila;

import java.util.ArrayList;
import java.util.List;

public class PilhaImpl<E> implements Pilha<E> {

    private final List<E> pilha;

    public PilhaImpl() {
        this.pilha = new ArrayList<E>();
    }

    @Override
    public void push(E elemento) {
        pilha.add(elemento);
    }

    @Override
    public E pop() {
        try {
            if(pilha.isEmpty()){
                throw new RuntimeException("Pilha já está vazia.");
            }
            return pilha.remove(pilha.size() - 1);
        } catch (RuntimeException e) {
            System.out.println("Pilha já está vazia. Não tem nada para remover");
            return null;
        }
    }

    @Override
    public E peek() throws Exception {
        try {
            if (pilha.isEmpty()) {
                throw new RuntimeException("A pilha está vazia");
            }
            return pilha.get(pilha.size() - 1);
        } catch (RuntimeException e) {
            System.out.println("Pilha está vazia. Não tem nada para ver.");
            return null;
        }
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