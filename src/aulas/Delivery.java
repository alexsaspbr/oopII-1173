
import interfaces.Stack;

import java.util.ArrayList;
import java.util.List;

public class Delivery implements Stack<String> {

    private final List<String> delivery;

    public Delivery() {
        this.delivery = new ArrayList<>();
    }

    @Override
    public void push(String element) {
        this.delivery.addFirst(element);
    }

    @Override
    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há entregas para remover!");
        }
        if (this.delivery.size() == 1) {
            this.delivery.removeFirst();
            return "Não existem mais entregas.";
        }
        this.delivery.removeFirst();
        return this.delivery.getFirst();
    }

    @Override
    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não existem entregas a serem feitas!");
        }
        return this.delivery.getFirst();
    }

    @Override
    public int size() {
        return this.delivery.size();
    }

    @Override
    public boolean isEmpty() {
        return this.delivery.isEmpty();
    }

    public void exibirDelivery() {
        if (isEmpty()) {
            System.out.println("Não existem entregas a serem feitas!");
        } else {
            System.out.println("Entregas: " + this.delivery);
        }
    }
}
