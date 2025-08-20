import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> nomesClientes;

    public Historico() {
        this.nomesClientes = new ArrayList<>();
    }

    public void adicionarNome(String nome) {
        this.nomesClientes.add(nome);
    }

    public void mostrarHistorico() {
        System.out.println("\n--- Histórico de Nomes de Clientes ---");
        if (nomesClientes.isEmpty()) {
            System.out.println("Nenhuma conta foi criada ainda.");
        } else {
            for (String nome : nomesClientes) {
                System.out.println("Conta criada para: " + nome);
            }
        }
    }
}