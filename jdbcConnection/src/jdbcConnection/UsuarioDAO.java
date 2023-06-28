package jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {

		this.conexao = new ConnectionFactory().conectar();
	}

	// insert
	public void insert(Usuario usuario) {
		String sql = "insert into usuarios (nome, senha, dataCadastro) values (?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setDate(3, usuario.getDataCadastro());
			// executar a query
			stmt.execute();
			// fechar a operação
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// select all
	public List<Usuario> selectAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuarios order by nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setDataCadastro(rs.getDate("dataCadastro"));
				usuarios.add(usuario);

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;

	}

	// selectById
	public Usuario selectById(long id) {
		Usuario usuario = null;
		String sql = "select * from usuarios where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setDataCadastro(rs.getDate("dataCadastro"));

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;

	}

	// update
	public void update(Usuario usuario) {
		String sql = "update usuarios set nome=?, senha =? where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setLong(3, usuario.getId());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// delete
	public void delete(long id) {
		String sql = "delete from  usuarios where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}