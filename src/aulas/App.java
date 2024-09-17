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
/*        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(7);
        numeros.add(9);
        Collections.sort(numeros);
        System.out.println(numeros);*/

        List<Pessoa> pessoas = new ArrayList<>();
        List<PessoaFisica> pessoasFisica = new ArrayList<>();

        pessoasFisica.add(new PessoaFisica("789"));
        pessoasFisica.add(new PessoaFisica("123"));
        pessoasFisica.add(new PessoaFisica("456"));
        List<PessoaJuridica> pessoasJuridica = new ArrayList<>();

        imprimirSuper(pessoas);
        //imprimirSuper(pessoasFisica);
        //imprimirSuper(pessoasJuridica);
        imprimirExtends(pessoasFisica);
        imprimirExtends(pessoasJuridica);
        imprimirExtends(pessoas);

       /* Collections.sort(pessoasFisica);
        System.out.println(pessoasFisica);*/
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Alex", new BigDecimal("1000.0")));
        funcionarios.add(new Funcionario("Matheus Lima", new BigDecimal("10000.0")));
        funcionarios.add(new Funcionario("Vanessa", new BigDecimal("15000.0")));
        funcionarios.add(new Funcionario("Lucas", new BigDecimal("12000.0")));

        Collections.sort(funcionarios);
        System.out.println(funcionarios);

    }

    public static void imprimirSuper(List<? super Pessoa> pessoas) {

    }

    public static void imprimirExtends(List<? extends Pessoa> pessoas) {

    }

}
