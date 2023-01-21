public class pessoaJuridica extends Cliente {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;


    public pessoaJuridica(String endereco, String cidade, String cep, String complemento, String cnpj,
            String inscricaoEstadual, String razaoSocial) {
        super(endereco, cidade, cep, complemento);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    @Override
    public String toString() {
        return "pessoaJuridica [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", razaoSocial="
                + razaoSocial + "]";
    }
}
