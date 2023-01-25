public class Pagamento{
    private float valor;
    private String tipoPagamento = "Debito";
    private float taxaPagamento = 1.5f/100;

    public float calcularPagamento(){
        Pedido p = new Pedido();

        valor = p.calcularValorLiquido();

        if (tipoPagamento == "credito" || tipoPagamento == "Credito" || tipoPagamento == "CREDITO"){
            valor = valor + valor * taxaPagamento;
        } else if (tipoPagamento == "debito" || tipoPagamento == "Debito" || tipoPagamento == "DEBITO"){
            valor = valor + valor * taxaPagamento;
        } else if (tipoPagamento == "pix" || tipoPagamento == "PIX" || tipoPagamento == "dinheiro" || tipoPagamento == "Dinheiro"){
            valor = valor + 0;
        };

        return valor;
    }
    
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public float gettaxaPagamento() {
        return taxaPagamento;
    }
    public void settaxaPagamento(float taxaPagamento) {
        this.taxaPagamento = taxaPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento [valor=" + valor + ", tipoPagamento=" + tipoPagamento + ", taxaPagamento=" + taxaPagamento
                + "]";
    }
}