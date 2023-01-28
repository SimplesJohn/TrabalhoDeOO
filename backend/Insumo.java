public class Insumo {
    private String armazenagem;
    private String cuidados;
    //alterar estoque de boolean para int
    private int estoque;

    public Insumo(String armazenagem, String cuidados, int estoque) {
        this.armazenagem = armazenagem;
        this.cuidados = cuidados;
        this.estoque = estoque;
    }
    
    public void addInsumo(int quantidade) {
    	Item.setQuantidade(Item.getQuantidade() + quantidade); 
    }

    public void rmvInsumo(int quantidade){
        Item.setQuantidade(Item.getQuantidade() - quantidade);
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
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    @Override
    public String toString() {
        return "Insumo [armazenagem=" + armazenagem + ", cuidados=" + cuidados + ", estoque=" + estoque + "]";
    }
}