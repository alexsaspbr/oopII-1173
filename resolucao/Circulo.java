import java.util.Scanner;

public class Circulo implements AreaCalculavel{

    final double PI = 3.14159;
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (PI * Math.pow(raio, 2));
    }
}
