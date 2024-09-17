import java.awt.datatransfer.StringSelection;

public class PessoaFisica extends Pessoa implements Comparable<PessoaFisica> {

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int compareTo(PessoaFisica pessoaFisica) {
        return this.cpf.compareTo(pessoaFisica.getCpf());
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
