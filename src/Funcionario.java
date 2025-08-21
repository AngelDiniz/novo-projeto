public class Funcionario {
    private int matricula;
    private String registro;
    private String nivel;

    public Funcionario(int matricula, String registro, String nivel) {
        this.matricula = matricula;
        this.registro = registro;
        this.nivel = nivel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
