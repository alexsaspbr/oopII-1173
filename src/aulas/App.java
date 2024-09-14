import bancodados.OracleDB;
import interfaces.Persistence;
import interfaces.Pilha;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        Persistence persistence = new OracleDB();
        persistence.save(1, new Contato());

        List<Integer> lista = new ArrayList();
        //lista.add("Alex");
        lista.add(1);

        for(Object obj : lista) {
            System.out.println(obj);
        }

        Pilha<Integer> pilhaInteiros = new PilhaImpl<>();
        pilhaInteiros.push(1);

    }

}
