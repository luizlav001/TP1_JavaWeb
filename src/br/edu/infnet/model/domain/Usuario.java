package br.edu.infnet.model.domain;

public class Usuario {

	private String nome;
	private String email;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("O usu�rio %s com o email: %s,  foi cadastrado com sucesso!",
				nome,
				email
				);
	}
	
	public void impressao() {
		System.out.println(this);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
