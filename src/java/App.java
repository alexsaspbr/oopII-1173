import tech.ada.locadora.modelo.veiculo.Carro;
import tech.ada.locadora.servico.VeiculoService;
import tech.ada.locadora.servico.VeiculoServiceImpl;

public class App {

    public static void main(String[] args) throws Exception {

        VeiculoService<Carro> carroService = new VeiculoServiceImpl();
        Carro ferrari = new Carro("XPTO1234", "F10", "Ferrari", true);
        Carro uno = new Carro("UNOO6789", "UNICO", "Fiat", false);
        carroService.cadastrar(ferrari);
        carroService.cadastrar(uno);

        System.out.println("ANTES");
        carroService.listar().stream().forEach(System.out::println);

        uno.setDisponivel(true);
        uno.setModelo("87");
        carroService.alterar(uno);

        System.out.println("DEPOIS");
        carroService.listar().stream().forEach(System.out::println);

    }

}
