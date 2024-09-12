package exercicios.resolucao;

public class Quadrado implements AreaCalculavel{
    private double base;

    public Quadrado(double base){
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return Math.pow(base, 2);
    }
}
