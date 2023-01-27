public class Cliente {
    private String endereco;
	private String cidade;
	private String cep;
	private String complemento;
    private Pedido pedido;

    public Cliente(String endereco, String cidade, String cep, String complemento, Pedido pedido) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String detalhes(){

        return "Cliente [endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", complemento=" + complemento + ", pedido:" + pedido + "]";

        // return "Cliente [endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", complemento=" + complemento + ", pedido:" + pedido.getNumero() + "Data do Pedido" + pedido.getDataPedido() + ", Data da Entrega:" + pedido.getDataEntrega() + "Valor Total:" + pedido.getValorTotal() + ", Valor imposto:"+ pedido.getValorImposto() + ", Aliquota:" + pedido.getAliquota()+ "]";
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente [endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", complemento=" + complemento + "]";
    }

    

}