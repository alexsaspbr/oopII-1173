package exercicios.resolucao.pilha.matheusgomes;

public class Main {

    public static void main(String[] args) throws Exception {

//        Persistence persistence = new OracleDB();
//        persistence.save(1, new Contato());

//        List<Integer> lista = new ArrayList();
//        //lista.add("Alex");
//        lista.add(1);
//
//        for(Object obj : lista) {
//            System.out.println(obj);
//        }
//
//        Pilha<Integer> pilhaInteiros = new PilhaImpl<>();
//        pilhaInteiros.push(1);

//        Email<PDF> email = new Outlook();
//        envioEmail(email, "mensagem");
//
//
//    }
//
//    public static void envioEmail(Email<PDF> email, String mensagem) {
//         email.enviarMensagem(mensagem, new PDF());
//    }

    Delivery pizza = new Delivery();

    Boolean entregasVazio = pizza.isEmpty();
        if(entregasVazio){
        System.out.println("Não existem entregas a serem feitas.");
    } else{
        System.out.println("Existem entregas a serem feitas!");
    }

        pizza.push("Pizza Calabresa");

        pizza.exibirDelivery();

    entregasVazio = pizza.isEmpty();
        if(entregasVazio){
        System.out.println("Não existem entregas a serem feitas.");
    } else{
        System.out.println("Existem entregas a serem feitas!");
    }

    String qtdEntregas = String.valueOf(pizza.size());
        System.out.println("Existe " + qtdEntregas + " entregas a serem feitas.");

        pizza.push("Pizza 4 Queijos");

        pizza.exibirDelivery();

    qtdEntregas = String.valueOf(pizza.size());
        System.out.println("Existe " + qtdEntregas + " entregas a serem feitas.");

        try{
        String primeiraEntrega = pizza.peek();
        System.out.println("A primeira entrega é: " + primeiraEntrega);
    } catch (Exception e){
        System.out.println(e.getMessage());
    }

    String entregaRemovida = pizza.pop();
        System.out.println("Uma entrega foi removida. Entrega atual: " + entregaRemovida);

        try{
        String primeiraEntrega = pizza.peek();
        System.out.println("A primeira entrega é: " + primeiraEntrega);
    } catch (Exception e){
        System.out.println(e.getMessage());
    }

        pizza.exibirDelivery();

    entregasVazio = pizza.isEmpty();
        if(entregasVazio){
        System.out.println("Não existem entregas a serem feitas.");
    } else{
        System.out.println("Existem entregas a serem feitas!");
    }

    entregaRemovida = pizza.pop();
        System.out.println("Uma entrega foi removida. Entrega atual: " + entregaRemovida);

        try{
        String primeiraEntrega = pizza.peek();
        System.out.println("A primeira entrega é: " + primeiraEntrega);
    } catch (Exception e){
        System.err.println(e.getMessage());
    }

}
}
