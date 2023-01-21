import java.util.Date;

public class Bebida extends Produto {
	
	private float tamanho;
	private String sabor;
	private float valor;
	private String marca;
	private float temperatura;
	
	public Bebida(Date validade, String modoPreparo, float tamanho, float peso, /*float tamanho,*/ String sabor, float valor, String marca, float temperatura) {
		super(validade, modoPreparo, tamanho, peso);
		/*this.tamanho = tamanho;*/
		this.sabor = sabor;
		this.valor = valor;
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

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
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
		return "Bebida [tamanho=" + tamanho + "sabor=" + sabor + "valor=" + valor + "marca=" + marca + "temperatura=" + temperatura + "]";
	}
}
