import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

      ///  Cliente cliente = new Cliente("Angel", "1111111111");
        ///  Conta contaDaAngel = new Conta(cliente, 500.0);

        ///Historico historico = new Historico();
        /// System.out.print("Nova conta criada " + contaDaAngel.getTitular().getNome());
        /// System.out.println("\n---Inicial ---");
        ///contaDaAngel.depositar(500);
        ///contaDaAngel.sacar(200);
        /// historico.adicionarNome(cliente.getNome());

        /// System.out.println(contaDaAngel.getSaldo());


        ///  Cliente cliente1= new Cliente("Gwendolyn","5000");
        /// System.out.println("Nova conta Criada " + cliente1.getNome());
        ///  historico.adicionarNome(cliente1.getNome());
        /// Cliente cliente2 = new Cliente ("Laranja","8000");
        /// historico.adicionarNome(cliente2.getNome());

        /// historico.mostrarHistorico();

   Funcionario funcionario1 = new Funcionario (1,"Angel","Gerencia");
        System.out.println("Funcionario Criado " + funcionario1.getRegistro()+ ", e ela é do nivel "+ funcionario1.getNivel() );

   Funcionario funcionario2 = new Funcionario(2,"Cassio","Diretoria");
        System.out.println("Funcionario Criado "+ funcionario2.getRegistro() +", e o mesmo é do nivel "+ funcionario2.getNivel());

    Administrativo administrativo = new Administrativo(3,"AngelDev","Administrativo");
    administrativo.setSenha(123);
    administrativo.autentica(123);

    }
}

