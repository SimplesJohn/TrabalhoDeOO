import java.util.Date;

public class Bebida extends Produto {
	
	private String sabor;
	private String marca;
	private float temperatura;
	
	public Bebida(Date validade, String modoPreparo, float tamanho, float peso, float valor, String sabor, String marca, float temperatura) {
		super(validade, modoPreparo, tamanho, peso, valor);
		this.sabor = sabor;
		this.marca = marca;
		this.temperatura = temperatura;
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
		return "Bebida [sabor=" + sabor + ", marca=" + marca + ", temperatura=" + temperatura + "]";
	}
}
