public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana Clara", "111.222.333-44");
        Conta contaDaAna = new Conta(cliente, 500.0);

        System.out.println("--- Dados Iniciais da Conta ---");
        System.out.println("Titular: " + contaDaAna.getTitular().getNome());
        System.out.println("CPF: " + contaDaAna.getTitular().getCpf());
        System.out.println("Saldo: R$" + contaDaAna.getSaldo());


        System.out.println("\n--- Realizando Operacoes ---");

        contaDaAna.depositar(300.0);

        contaDaAna.sacar(150.0);

        contaDaAna.sacar(1000.0);

        System.out.println("\n--- Saldo Final ---");
        System.out.println("Saldo atual: R$" + contaDaAna.getSaldo());
    }
}