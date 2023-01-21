public class pessoaFisica extends Cliente {
    private String cpf;
	private String nome;
    private String sexo;

    public pessoaFisica(String endereco, String cidade, String cep, String complemento, String cpf, String nome, String sexo) {
        super(endereco, cidade, cep, complemento);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "pessoaFisica [cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

}
