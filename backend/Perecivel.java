import java.util.Date;

public class Perecivel extends Insumo{
	
	private String cuidadosEspeciais;
	private Date prazoConservacao;
	private String localArmazenamento;
	private float controleTemperatura;
	
	public Perecivel(String armazenagem, String cuidados, int estoque, String cuidadosEspeciais, Date prazoConservacao, String localArmazenamento, float controleTemperatura) {
		super(armazenagem, cuidados, estoque);
		this.cuidadosEspeciais = cuidadosEspeciais;
		this.prazoConservacao = prazoConservacao;
		this.localArmazenamento = localArmazenamento;
		this.controleTemperatura = controleTemperatura;
	}
	
	public String getCuidadosEspeciais() {
		return cuidadosEspeciais;
	}
	
	public void setCuidadosEspeciais(String cuidadosEspeciais) {
		this.cuidadosEspeciais = cuidadosEspeciais;
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
	
	public float getcontroleTemperatura() {
		return controleTemperatura;
	}
	
	public void setcontroleTemperatura(float controleTemperatura) {
		this.controleTemperatura = controleTemperatura;
	}
	
	@Override
	public String toString() {
		return "Perecivel [cuidadosEspeciais=" + cuidadosEspeciais + ", prazoConservacao=" + prazoConservacao + ", localArmazenamento=" + localArmazenamento + ", controleTemperatura=" + controleTemperatura + "]";
	}
	
}
