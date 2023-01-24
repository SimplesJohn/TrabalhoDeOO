public class Comida extends Produto{
	
	private String ingredientePrincipal;
	private String complemento;


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
