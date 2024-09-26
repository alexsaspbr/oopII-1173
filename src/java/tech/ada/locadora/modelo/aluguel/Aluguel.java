package tech.ada.locadora.modelo.aluguel;

import tech.ada.locadora.modelo.agencia.Agencia;
import tech.ada.locadora.modelo.pessoa.Pessoa;
import tech.ada.locadora.modelo.veiculo.Veiculo;

import java.time.LocalDateTime;

public class Aluguel {

    protected Pessoa cliente;
    protected Agencia agencia;
    protected Veiculo veiculo;
    protected LocalDateTime dataInicio;
    protected LocalDateTime dataDevolucaoPrevista;
    protected LocalDateTime dataDevolucaoFinal;
    protected Boolean devolvido;

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }
}
