public class Loja {
    private String nome;
    private String endereco;
    private String utensilios;
    private String telefone;

    public Loja(String nome, String endereco, String utensilios, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.utensilios = utensilios;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getUtensilios() {
        return utensilios;
    }
    public void setUtensilios(String utensilios) {
        this.utensilios = utensilios;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", endereco=" + endereco + ", utensilios=" + utensilios + ", telefone=" + telefone
                + "]";
    }
}
