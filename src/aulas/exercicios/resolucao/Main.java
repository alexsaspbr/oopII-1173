package exercicios.resolucao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Escolha uma opção para calcular: ");
            System.out.println("* 1 - Circulo");
            System.out.println("* 2 - Quadrado");
            System.out.println("* 3 - Triangulo\n");
            System.out.print("Opcão: ");

            String opcao = sc.next();
            switch (opcao) {
                case "1":
                    System.out.print("Digite o valor do raio do circulo: ");
                    double raio = sc.nextDouble();

                    exercicios.resolucao.Circulo circulo = new exercicios.resolucao.Circulo(raio);
                    System.out.printf("A área do circulo de raio %.0fcm é %.2f cm²\n\n",raio, circulo.calcularArea());;
                    break;
                case "2":
                    System.out.print("Digite o valor da base do quadrado: ");
                    double baseQuadrado = sc.nextDouble();

                    exercicios.resolucao.Quadrado quadrado = new exercicios.resolucao.Quadrado(baseQuadrado);
                    System.out.printf("A área do quadrado de base %.0fcm é %.2f cm²\n\n",baseQuadrado, quadrado.calcularArea());
                    break;
                case "3":
                    System.out.print("Digite o valor da base do triangulo: ");
                    double baseTriangulo = sc.nextDouble();
                    System.out.print("Agora digite o valor da altura: ");
                    double altura = sc.nextDouble();
                    exercicios.resolucao.Triangulo triangulo = new exercicios.resolucao.Triangulo(baseTriangulo, altura);
                    System.out.printf("A área do triangulo de base %.0fcm e altura %.0fcm é  %.2f cm²\n\n",baseTriangulo, altura, triangulo.calcularArea());
                    break;
                case "4":
                    System.out.println("Saindo...");
                    sc.close();
                    isRunning = false;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    }
}
