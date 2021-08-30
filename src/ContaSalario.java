public class ContaSalario extends Conta {

    private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;

    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            if (this.limiteSaque > 1) {
                this.limiteSaque--;
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("Limite de Saques Excedido");
                return false;
            }

        }

    }
}