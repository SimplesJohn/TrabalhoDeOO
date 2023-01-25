import java.util.Date;
public class Pedido {
    /*atributos*/

    private int numero;
    private Date dataPedido;
    private Date dataEntrega;
    private float valorTotal;
    private float valorImposto;
    private float aliquota;

    /*Construtores*/
    
    

    /*servicos*/
    Comida comida1 = new Comida();
    Cafe cf = new Cafe();
    Bebida b = new Bebida();
    Imposto i = new Imposto();

    public float calcularValorTotal() {

        comida1.setValor(34);

        Carrinho c = new Carrinho();
        // c.addProdutos(3);

        // valorTotal = c.quantidade*comida1.getValor();
        valorTotal = c.addProdutos(3)*comida1.getValor();

        
       return valorTotal;
         
    }
    public float calcularImposto() {
        comida1.setValor(34);

        float total;
        aliquota = i.calcularFaixas();

        total = aliquota * comida1.getValor();

        return total;
    }
    public float calcularValorLiquido() {
        valorImposto = calcularValorTotal() - calcularImposto();
        return valorImposto;
    }

    // Getters and Setters
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public Date getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public float getValorImposto() {
        return valorImposto;
    }
    public void setValorImposto(float valorImposto) {
        this.valorImposto = valorImposto;
    }
    public float getAliquota() {
        return aliquota;
    }
    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public String toString() {
        return "Pedido [numero=" + numero + ", dataPedido=" + dataPedido + ", dataEntrega=" + dataEntrega
                + ", valorTotal=" + valorTotal + ", valorImposto=" + valorImposto + ", aliquota=" + aliquota + "]";
    }
}
