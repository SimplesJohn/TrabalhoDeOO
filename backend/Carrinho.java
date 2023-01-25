public class Carrinho {
    int quantidade;
    public int addProdutos(int quantidade){
        this.quantidade = quantidade++;
        return quantidade;
    }

    public int rmvProdutos(int quantidade){
        this.quantidade = quantidade--;
        return quantidade;
    }
}
