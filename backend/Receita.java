public class Receita {
    private String insumo;
    private String produto;
    private String porcao;

    public Receita(String insumo, String produto, String porcao) {
        this.insumo = insumo;
        this.produto = produto;
        this.porcao = porcao;
    }
    
    public String getInsumo() {
        return insumo;
    }
    public void setInsumo(String insumo) {
        this.insumo = insumo;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getPorcao() {
        return porcao;
    }
    public void setPorcao(String porcao) {
        this.porcao = porcao;
    }

    @Override
    public String toString() {
        return "Receita [insumo=" + insumo + ", produto=" + produto + ", porcao=" + porcao + "]";
    }
}