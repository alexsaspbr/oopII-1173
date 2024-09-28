package tech.ada.locadora.repository;

import tech.ada.locadora.modelo.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VeiculoRepositoryImpl<T extends Veiculo> extends VeiculoReposity<T> {

    public List<T> bancoDados;

    public VeiculoRepositoryImpl(List<T> bancoDados) {
        this.bancoDados = bancoDados;
    }

    @Override
    public T salvar(T veiculo) {
        this.bancoDados.add(veiculo);
        return veiculo;
    }

    @Override
    public List<T> todos() {
        return this.bancoDados;
    }

    @Override
    public T alterar(T veiculo) {
        Optional<T> optionalVeiculo = this.buscarPor(veiculo.getPlaca());
        if(optionalVeiculo.isPresent()) {
            T veiculoBD = optionalVeiculo.get();
            int index = this.bancoDados.indexOf(veiculoBD);
            veiculoBD.setDisponivel(veiculo.getDisponivel());
            veiculoBD.setMarca(veiculo.getMarca());
            veiculoBD.setModelo(veiculo.getModelo());
            this.bancoDados.set(index, veiculoBD);
            return veiculoBD;
        }
        return null;
    }

    @Override
    public Optional<T> buscarPor(String placa) {
        return this.bancoDados
                .stream()
                .filter(veiculo -> placa.equalsIgnoreCase(veiculo.getPlaca())).findFirst();
    }

}
