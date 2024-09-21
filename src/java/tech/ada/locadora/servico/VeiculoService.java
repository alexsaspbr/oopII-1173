package tech.ada.locadora.servico;

import tech.ada.locadora.modelo.veiculo.Veiculo;

import java.util.List;

public interface VeiculoService<T extends Veiculo> {

     T cadastrar(T veiculo);
     T alterar(T veiculo);
     T buscarPorNome(String nome);
     List<T> listar();
     void remover(T veiculo);

}
