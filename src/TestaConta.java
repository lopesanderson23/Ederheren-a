public class TestaConta {
    public static void main (String[] args) {
        Conta contas[] = new Conta[3];

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 200,100);
        ContaPoupanca p1 = new ContaPoupanca(33,3,"Banco CCC",200,0.05,20);
        ContaSalario cc2 = new ContaSalario(22,2,"Banco DD",200.00,3);

        contas[0] = cc1;
        contas[1] = p1;
        contas[2] = cc2;

        System.out.println(" Saldo atualizado das contas:");
        for (Conta conta:contas){
            System.out.println(conta);
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("======================================");
        }

    }
}
