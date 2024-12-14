package interfaces;

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("João");

        triatleta.aquecer();
        triatleta.nadar();
        triatleta.correr();
        triatleta.correrDeBicicleta();
    }
}
