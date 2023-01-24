public class Bebida extends Produto {
	
	private String sabor;
	private String marca;
	private float temperatura;
	
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
