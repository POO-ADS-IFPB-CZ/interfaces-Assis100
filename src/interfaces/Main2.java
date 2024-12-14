
package interfaces;

public class Main2 {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca(1000);

        System.out.println("Saldo inicial: " + poupanca.getSaldo());
        poupanca.reajustar(5); // Reajuste de 5%
        poupanca.depositar(200);
        System.out.println("Saldo após depósito: " + poupanca.getSaldo());
        poupanca.sacar(300);
        System.out.println("Saldo final: " + poupanca.getSaldo());
    }
}
