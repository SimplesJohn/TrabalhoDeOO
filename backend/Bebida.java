import java.util.Date;

public class Bebida extends Produto {
	
	private float tamanho;
	private String sabor;
	private String marca;
	private float temperatura;
	
	public Bebida(Date validade, String modoPreparo, float tamanho, float peso, /*float tamanho,*/ String sabor, String marca, float temperatura) {
		super(validade, modoPreparo, tamanho, peso);
		/*this.tamanho = tamanho;*/
		this.sabor = sabor;
		this.marca = marca;
		this.temperatura = temperatura;
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return "Bebida [tamanho=" + tamanho + "sabor=" + sabor + "marca=" + marca + "temperatura=" + temperatura + "]";
	}
}
