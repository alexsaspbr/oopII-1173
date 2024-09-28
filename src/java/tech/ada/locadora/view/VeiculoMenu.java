package tech.ada.locadora.view;

import tech.ada.locadora.modelo.veiculo.Carro;
import tech.ada.locadora.servico.VeiculoService;
import tech.ada.locadora.servico.VeiculoServiceImpl;

public class VeiculoMenu {

    private final VeiculoService veilculoService;

    public VeiculoMenu(VeiculoService veiculoService) {
         this.veilculoService = veiculoService;
     }

    public void cadastrar() {

        Carro ferrari = new Carro("XPTO1234", "F10", "Ferrari", true);
        Carro uno = new Carro("UNOO6789", "UNICO", "Fiat", false);
        veilculoService.cadastrar(ferrari);
        veilculoService.cadastrar(uno);

        System.out.println("ANTES");
        veilculoService.listar().stream().forEach(System.out::println);

        uno.setDisponivel(true);
        uno.setModelo("87");
        veilculoService.alterar(uno);

        System.out.println("DEPOIS");
        veilculoService.listar().stream().forEach(System.out::println);

    }

}
