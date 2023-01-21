public class Barista extends Funcionario{
    private String escala;

    public Barista(String nome, String cpf, char sexo, String matricula, String escala) {
        super(nome, cpf, sexo, matricula);
        this.escala = escala;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return "Barista [escala=" + escala + "]";
    }
}
