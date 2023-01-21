public class Carrinho {
    float quantidade;
    public void addProdutos(float quantidade){
        this.quantidade = quantidade++;
    }

    public void rmvProdutos(float quantidade){
        this.quantidade = quantidade--;
    }
}
