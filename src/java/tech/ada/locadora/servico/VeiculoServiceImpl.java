package tech.ada.locadora.servico;

import tech.ada.locadora.modelo.veiculo.Veiculo;
import tech.ada.locadora.repository.VeiculoRepositoryImpl;
import tech.ada.locadora.repository.VeiculoReposity;

import java.util.List;

public class VeiculoServiceImpl<T extends Veiculo> implements VeiculoService<T> {

    private VeiculoReposity<T> veiculoReposity;

    public VeiculoServiceImpl(VeiculoReposity<T> veiculoReposity) {
        this.veiculoReposity = veiculoReposity;
    }

    @Override
    public T cadastrar(T veiculo) {
        //regras aqui
        return this.veiculoReposity.salvar(veiculo);
    }

    @Override
    public T alterar(T veiculo) {
        return this.veiculoReposity.alterar(veiculo);
    }

    @Override
    public T buscarPorNome(String nome) {
        return null;
    }

    @Override
    public List<T> listar() {
        return this.veiculoReposity.todos();
    }

    @Override
    public void remover(T veiculo) {

    }
}
