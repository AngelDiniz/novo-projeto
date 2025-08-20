import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Angel", "1111111111");
        Conta contaDaAngel = new Conta(cliente, 500.0);


        System.out.print("Nova conta criada " + contaDaAngel.getTitular().getNome());
        System.out.println("\n---Inicial ---");
        contaDaAngel.depositar(500);
        contaDaAngel.sacar(200);


        System.out.println(contaDaAngel.getSaldo());


        }

}

