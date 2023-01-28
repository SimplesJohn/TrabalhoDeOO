public class Item {
	
    private static int quantidade;
    private static float valor;

    public Item(int quantidade, float valor) {
        Item.quantidade = quantidade;
        Item.valor = valor;
    }
    
    public static int getQuantidade() {
        return quantidade;
    }
    public static void setQuantidade(int quantidade) {
        Item.quantidade = quantidade;
    }
    public static float getValor() {
        return valor;
    }
    public static void setValor(float valor) {
        Item.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Item [quantidade=" + quantidade + ", valor=" + valor + "]";
    }
}
