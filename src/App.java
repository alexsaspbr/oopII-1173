

public class App {
    public static void main(String[] args) throws Exception {
        
        Navio navio = new Navio();
        Barco barco = new Barco();
        TanqueAnfibio tanqueAnfibio = new TanqueAnfibio();

        somenteAquaticos(navio);
        somenteAquaticos(barco);
        aceletarVeiculos(barco);
        somenteAquaticos(tanqueAnfibio);
    }

    public static void somenteAquaticos(Aquatico veiculo) {
        veiculo.navegar();
    }

    public static void aceletarVeiculos(Veiculo veiculo) {
        veiculo.acelerar();
    }

}
