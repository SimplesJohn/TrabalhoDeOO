public class Pagamento{
    private float valor;
    private String tipoPagamento;
    private float floatPagamento;

    public Pagamento(float valor, String tipoPagamento, float floatPagamento) {
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.floatPagamento = floatPagamento;
    }

    public void calcularPagamento(){
        
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
    public float getFloatPagamento() {
        return floatPagamento;
    }
    public void setFloatPagamento(float floatPagamento) {
        this.floatPagamento = floatPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento [valor=" + valor + ", tipoPagamento=" + tipoPagamento + ", floatPagamento=" + floatPagamento
                + "]";
    }
}