import java.util.Date;

public class Cafe extends Produto {

		private String tipoCafe;
		private String sabor;
		private String fragancia;
		private String aroma;
		private String acidez;
		private String amargor;
		private String residuo;
		
		public Cafe(Date validade, String modoPreparo, float tamanho, float peso, float valor, String tipoCafe, String sabor, String fragancia, String aroma, String acidez, String amargor, String residuo) {
			super(validade, modoPreparo, tamanho, peso, valor);
			this.tipoCafe = tipoCafe;
			this.sabor = sabor;
			this.fragancia = fragancia;
			this.aroma = aroma;
			this.acidez = acidez;
			this.amargor = amargor;
			this.residuo = residuo;
		}
		
		public String getTipoCafe() {
			return tipoCafe;
		}
		
		public void setTipoCafe(String tipoCafe) {
			this.tipoCafe = tipoCafe;
		}
		
		public String getSabor() {
			return sabor;
		}
		
		public void setSabor(String sabor) {
			this.sabor = sabor;
		}
		
		public String getFragancia() {
			return fragancia;
		}
		
		public void setFragancia(String fragancia) {
			this.fragancia = fragancia;
		}
		
		public String getAroma() {
			return aroma;
		}
		
		public void setAroma(String aroma) {
			this.aroma = aroma;
		}
		
		public String getAcidez() {
			return acidez;
		}
		
		public void setAcidez(String acidez) {
			this.acidez = acidez;
		}
		
		public String getAmargor() {
			return amargor;
		}
		
		public void setAmargor(String amargor) {
			this.amargor = amargor;
		}
		
		public String getResiduo() {
			return residuo;
		}
		
		public void setResiduo(String residuo) {
			this.residuo = residuo;
		}
		
		@Override
		public String toString() {
			return "Cafe [tipoCafe=" + tipoCafe + "sabor=" + sabor + "fragancia=" + fragancia + "aroma=" + aroma + "acidez=" + acidez + "amargor=" + amargor + "residuo=" + residuo + "]";
		}
}
