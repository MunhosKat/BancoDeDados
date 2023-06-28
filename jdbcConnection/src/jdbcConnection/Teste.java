package jdbcConnection;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao =new UsuarioDAO();
		Usuario joao = new Usuario(3,"Joao","ABC123");
		
		dao.insert(joao);
		
	

	}

}