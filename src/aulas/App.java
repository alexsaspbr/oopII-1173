import bancario.CaixaEletronico;
import bancario.ContaCorrente;
import bancario.ContaPoupanca;
import bancario.ContaSalario;
import funcionario.Funcionario;
import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class App {

    public static void main(String[] args) throws Exception {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaSalario cs = new ContaSalario();

        new CaixaEletronico().sacar(cc, new BigDecimal("100"));
        new CaixaEletronico().sacar(cp, new BigDecimal("300"));
        new CaixaEletronico().sacar(cs, new BigDecimal("300"));

    }

    public static void imprimirSuper(List<? super Pessoa> pessoas) {

    }

    public static void imprimirExtends(List<? extends Pessoa> pessoas) {

    }

}
