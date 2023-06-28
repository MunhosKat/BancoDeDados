package br.com.fiap.model;

import java.sql.Date;

import br.com.fiap.util.CriptografiaUtils;

public class Usuario {

	private long id;
	private String nome, senha;
	private Date dataCadastro;

	public Usuario() {

	}

	public Usuario(String nome, String senha) {

		this.nome = nome;
		setSenha(senha);
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
		try {
			this.senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}