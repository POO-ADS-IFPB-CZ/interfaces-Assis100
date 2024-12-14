package interfaces;

public class Poupanca extends Conta implements Investimento {

    public Poupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void reajustar(double taxa) {
        saldo += saldo * (taxa / 100);
        System.out.println("Novo saldo após reajuste: " + saldo);
    }
}

