package bancodados;

import exercicios.resolucao.Circulo;
import interfaces.Persistence;

public class MeuBancoDados<Circulo> implements Persistence<Integer, Circulo> {
    @Override
    public void save(Integer identificador, Circulo circulo) {
        System.out.printf("Salvando dado %s no MeuBancoDados\n", circulo);
    }

    @Override
    public Circulo buscar(String nome) {
        return null;
    }
}
