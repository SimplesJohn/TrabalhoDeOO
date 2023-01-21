public class Funcionario {
	
	private String nome;
	private String cpf;
	private char sexo;
	private String matricula;
	
	public Funcionario(String nome, String cpf, char sexo, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + "cpf=" + cpf + "sexo=" + sexo + "matricula=" + matricula + "]";
	}
	
}
