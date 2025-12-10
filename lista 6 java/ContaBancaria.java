public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta) {
        this(numeroConta, 0.0);
    }

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Conta: " + numeroConta + " - Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("12345");
        c1.exibirSaldo();
        c1.depositar(500.0);
        c1.exibirSaldo();
        boolean sucesso = c1.sacar(200.0);
        System.out.println("Saque bem-sucedido? " + sucesso);
        c1.exibirSaldo();
        ContaBancaria c2 = new ContaBancaria("54321", 1000.0);
        c2.exibirSaldo();
    }
}
