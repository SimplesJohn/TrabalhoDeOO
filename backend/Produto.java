import java.util.Date;

public class Produto {
	
	private Date validade;
	private String modoPreparo;
	private float tamanho;
	private float peso;
	
	public Produto(Date validade, String modoPreparo, float tamanho, float peso) {
		this.validade = validade;
		this.modoPreparo = modoPreparo;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public String getModoPreparo() {
		return modoPreparo;
	}
	
	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Produto [validade=" + validade + ", modoPreparo=" + modoPreparo + ", tamanho=" + tamanho + ", peso=" + peso + "]";
	}

}
