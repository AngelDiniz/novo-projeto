class Conta {
    private Cliente titular;
    private double saldo;

    public Conta(Cliente titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque no valor de " + valor + " realizado com sucesso.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor de saque invalido");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
}