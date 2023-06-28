package jdbcConnection;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario matheus = new Usuario("Matheus", "ABC123");
		Usuario henrique = new Usuario("Henrique", "ABC123");
		Usuario joao = new Usuario ("Joao", "ABC123");
		Usuario guilherme = new Usuario ("Guilherme","ABC123");

		dao.insert(guilherme);
		//dao.insert(matheus);
		//dao.insert(henrique);
		// dao.insert(joao);
		
		List <Usuario> usuarios = dao.selectAll();
		
		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: "+ usuario.getNome());
			System.out.println("Data de Cadastro: "+ usuario.getDataCadastro());
		}
		
		System.out.println("------------------------------");
		
		

		
//		Usuario usuario = dao.selectById(1);
//		System.out.println(usuario.getId());
//		System.out.println(usuario.getNome());
//		System.out.println(usuario.getSenha());
//		System.out.println(usuario.getDataCadastro());
//		
		
		dao.delete(1);
		
	
		
		
		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: "+ usuario.getNome());
			System.out.println("Data de Cadastro: "+ usuario.getDataCadastro());
		}
		
		
		
	}

}