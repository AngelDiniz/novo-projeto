import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> nomesClientes;

    // O construtor inicializa a lista
    public Historico() {
        this.nomesClientes = new ArrayList<>();
    }

    // Método para adicionar um nome de cliente à lista
    public void adicionarNome(String nome) {
        this.nomesClientes.add(nome);
    }

    // Método para exibir o histórico de nomes
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