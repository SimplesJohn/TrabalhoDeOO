public class Rota extends Funcionario {
    private String rota;

    public Rota(String nome, String cpf, char sexo, String matricula) {
        super(nome, cpf, sexo, matricula);
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "Rota [rota=" + rota + "]";
    }    
}
