package jdbcConnection;

import java.sql.Date;

public class Usuario {
	
	private long id;
	private String nome,senha;
	private Date dataCadastro;
	
	
	public Usuario(long id, String nome, String senha) {
		
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}