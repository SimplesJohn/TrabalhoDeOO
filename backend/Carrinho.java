public class Carrinho {
    
	public void addProdutos(int quantidade){
        Item.setQuantidade(Item.getQuantidade() + quantidade);
    }

    public void rmvProdutos(int quantidade){
    	Item.setQuantidade(Item.getQuantidade() - quantidade);
    }
}
