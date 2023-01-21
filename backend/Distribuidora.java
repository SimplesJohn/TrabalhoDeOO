public class Distribuidora{
    private String endereco;
	private String cidade;
	private String cep;
	private String complemento;

    public Distribuidora(String endereco, String cidade, String cep, String complemento) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.complemento = complemento;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Distribuidora [endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", complemento="
                + complemento + "]";
    }
}