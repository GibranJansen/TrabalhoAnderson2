package model;

public class Pessoa {
	
	private int cpf;
	private String nome;
	private int idade;
	private String endereco;
	private int codigomec;
	private int codigounid;
	private String curso;
	
	public Pessoa() {
	}
	
	public Pessoa(int cpf, String nome, int idade, String endereco, int codigomec, int codigounid, String curso) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.codigomec = codigomec;
		this.codigounid = codigounid;
		this.curso = curso;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getCodigomec() {
		return codigomec;
	}
	
	public void setCodigomec(int codigomec) {
		this.codigomec = codigomec;
	}
	
	public int getCodigounid() {
		return codigounid;
	}
	
	public void setCodigounid(int codigounid) {
		this.codigounid = codigounid;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Pessoa{" +
				"cpf=" + "cpf" +
				", nome=" + "nome" +
				", idade=" + "idade" +
				", endereco=" + "endereco" +
				", codigomec=" + "codigomec" +
				", codigounid=" + "codigounid" +
				", curso=" + "curso" +
				'}';
	}
}
