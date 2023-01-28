import java.util.Date;

public class NaoPerecivel extends Insumo {
    private Date prazoConservacao;
    private String localArmazenamento;
    
    public NaoPerecivel(String armazenagem, String cuidados, int estoque, Date prazoConservacao,
            String localArmazenamento) {
        super(armazenagem, cuidados, estoque);
        this.prazoConservacao = prazoConservacao;
        this.localArmazenamento = localArmazenamento;
    }

    public Date getPrazoConservacao() {
        return prazoConservacao;
    }
    public void setPrazoConservacao(Date prazoConservacao) {
        this.prazoConservacao = prazoConservacao;
    }
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }
    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    @Override
    public String toString() {
        return "NaoPerecivel [prazoConservacao=" + prazoConservacao + ", localArmazenamento=" + localArmazenamento
                + "]";
    }
}
