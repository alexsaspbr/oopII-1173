import java.io.Serializable;
import java.math.BigDecimal;

public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        return this.salario.compareTo(funcionario.getSalario());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
