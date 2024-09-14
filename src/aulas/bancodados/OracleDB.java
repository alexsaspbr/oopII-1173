package bancodados;

import interfaces.Persistence;

public class OracleDB<Contato> implements Persistence<Integer, Contato> {
    @Override
    public void save(Integer identificador, Contato valor) {
        //
    }

    @Override
    public Contato buscar(String nome) {
        return null;
    }
}
