public class Conta {
    private titular;
    private saldo;

    public Conta(Cliente titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

    }
    public void depositar (double valor){
        if (valor > 0 ){
            this.saldo += valor;
            System.out.println("Deposito de " + valor + "Realizado com sucesso.";
        }else{
            System.out.println("Valor de deposito ivalido.");
        }
    }
    public void sacar (double valor) {
        if (valor > 0 && this.saldo >- valor) {
            this.saldo -= valor;
            System.out.println("Saque no valor  de" + valor + " realizado com sucesso.");
        }else if (valor : this.saldo){
            System.out.println(" Valor insuficiente");
        }else{
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
