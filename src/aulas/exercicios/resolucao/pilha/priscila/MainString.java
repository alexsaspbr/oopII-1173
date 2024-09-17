package exercicios.resolucao.pilha.priscila;

public class MainString {
    public static void main(String[] args) throws Exception {
        Pilha<String> pilhaString = new PilhaImpl<>();

        //Adicionar inteiros
        pilhaString.push("segunda-feira");
        pilhaString.push("terça-feira");
        pilhaString.push("quarta-feira");
        pilhaString.push("quinta-feira");
        pilhaString.push("sexta-feira");

        //Remover inteiros
        System.out.println("O elemento removido da pilha é: " + pilhaString.pop());
        System.out.println("O elemento removido da pilha é: " + pilhaString.pop());

        System.out.println("O ultimo elemento da pilha é: " + pilhaString.peek());

        System.out.println("O tamanho da pilha é: " + pilhaString.size());

        System.out.println("A pilha está vazia? " + pilhaString.isEmpty());


    }
}
