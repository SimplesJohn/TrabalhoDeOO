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
    
    public Pedido(int numero, Date dataPedido, Date dataEntrega, float valorTotal, float valorImposto, float aliquota) {
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.valorTotal = valorTotal;
        this.valorImposto = valorImposto;
        this.aliquota = aliquota;
    }

    /*servicos*/

    public float calcularValorTotal() {
        Date data = new Date(); 

        Comida comida1 = new Comida(
            data,
            "Cozinhar",
            20,
            2,
            24,
            "carne de sol",
            "mandioca"
        );

        Carrinho c = new Carrinho();
        c.addProdutos(3);

        Pedido p = new Pedido(
            0, 
            data,
            data, 
            0, 
            0, 
            0
        );

        valorTotal = c.quantidade*comida1.getValor();
        return valorTotal;
    }
    public void calcularImposto() {
        // implementar
    }
    public void calcularValorLíquido(float desconto) {
        // implementar 
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
