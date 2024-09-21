package tech.ada.locadora.repository;

import tech.ada.locadora.modelo.veiculo.Veiculo;

import java.util.List;
import java.util.Optional;

public abstract class VeiculoReposity<T extends Veiculo> {
    public abstract T salvar(T veiculo);
    public abstract List<T> todos();
    public abstract T alterar(T veiculo);
    public abstract Optional<T> buscarPor(String placa);
}
