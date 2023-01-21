public class Insumo {
    private String armazenagem;
    private String cuidados;
    private Boolean estoque;

    public Insumo(String armazenagem, String cuidados, Boolean estoque) {
        this.armazenagem = armazenagem;
        this.cuidados = cuidados;
        this.estoque = estoque;
    }

    public void addInsump(int quantidade){
        quantidade++;
    }

    public void rmvInsumo(int quantidade){
        quantidade--;
    }

    public String getArmazenagem() {
        return armazenagem;
    }
    public void setArmazenagem(String armazenagem) {
        this.armazenagem = armazenagem;
    }
    public String getCuidados() {
        return cuidados;
    }
    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }
    public Boolean getEstoque() {
        return estoque;
    }
    public void setEstoque(Boolean estoque) {
        this.estoque = estoque;
    }
    @Override
    public String toString() {
        return "Insumo [armazenagem=" + armazenagem + ", cuidados=" + cuidados + ", estoque=" + estoque + "]";
    }
}