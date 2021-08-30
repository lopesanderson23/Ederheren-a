public class ContaPoupanca extends Conta{
    private final double taxadeJuros;
    private final int diaAniversario;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double taxadeJuros, int diaAniversario) {
        super(numero, agencia, banco, saldo);
        this.taxadeJuros = taxadeJuros;
        this.diaAniversario = diaAniversario;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.taxadeJuros*this.saldo;
    }

    @Override
    public boolean sacar(double valor) {
        this.saldo -= valor;
        return true;
    }
}
