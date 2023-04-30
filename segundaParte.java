public class Coche {
    int numPuertas;
    public void incrementarPuertas() {
        numPuertas++;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
    }
    System.out.println(miCoche.numPuertas);
}
