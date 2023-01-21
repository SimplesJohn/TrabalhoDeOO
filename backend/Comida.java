import java.util.Date;

public class Comida extends Produto{
	
	private String ingredientePrincipal;
	private String complemento;

	public Comida(Date validade, String modoPreparo, float tamanho, float peso, float valor, String ingredientePrincipal,
			String complemento) {
		super(validade, modoPreparo, tamanho, peso, valor);
		this.ingredientePrincipal = ingredientePrincipal;
		this.complemento = complemento;
	}

	public String getIngredientePrincipal() {
		return ingredientePrincipal;
	}
	public void setIngredientePrincipal(String ingredientePrincipal) {
		this.ingredientePrincipal = ingredientePrincipal;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Comida [ingredientePrincipal=" + ingredientePrincipal + ", complemento=" + complemento + "]";
	}
	
}
