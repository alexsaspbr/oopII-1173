package exercicios.resolucao.pilha.priscila;

public class MainInteiros {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilhaInteiros = new PilhaImpl<>();

        pilhaInteiros.push(1);
        pilhaInteiros.push(2);
        pilhaInteiros.push(3);
        pilhaInteiros.push(4);
        pilhaInteiros.push(5);

        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O ultimo elemento da pilha é: " + pilhaInteiros.peek());
        System.out.println("O tamanho da pilha é: " + pilhaInteiros.size());
        System.out.println("A pilha está vazia? " + pilhaInteiros.isEmpty());

        System.out.println("-------------------------------------------------------------");

        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O elemento removido da pilha é: " + pilhaInteiros.pop());
        System.out.println("O tamanho da pilha é: " + pilhaInteiros.size());
        System.out.println("A pilha está vazia? " + pilhaInteiros.isEmpty());
        System.out.println("O ultimo elemento da pilha é: " + pilhaInteiros.peek());



    }
}
