import tech.ada.locadora.repository.VeiculoRepositoryImpl;
import tech.ada.locadora.servico.VeiculoServiceImpl;
import tech.ada.locadora.view.Menu;
import tech.ada.locadora.view.VeiculoMenu;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList bancoDados = new ArrayList();
        VeiculoRepositoryImpl veiculoReposity = new VeiculoRepositoryImpl(bancoDados);
        VeiculoMenu veiculoMenu = new VeiculoMenu(new VeiculoServiceImpl(veiculoReposity));
        new Menu(veiculoMenu).start();

    }

}
