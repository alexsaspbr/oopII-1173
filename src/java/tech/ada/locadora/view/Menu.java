package tech.ada.locadora.view;

import java.util.Scanner;

public class Menu {

     private VeiculoMenu veiculoMenu;

    public Menu(VeiculoMenu veiculoMenu) {
        this.veiculoMenu = veiculoMenu;
    }

    public void start() {

        int resposta = 0;
        while(resposta == 0) {

            System.out.println("Cadastrando veiculo");
            this.veiculoMenu.cadastrar();

            System.out.println("Deseja continuar 0 - SIM 1 - NAO");
            resposta = new Scanner(System.in).nextInt();
        }


    }


}
