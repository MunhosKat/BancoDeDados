package br.com.fiap.view;

import java.sql.SQLException;

import javax.swing.JFrame;

public class TestaView {

	public static void main(String[] args) {
		UsuarioFrame frame = null;
		try {
			frame = new UsuarioFrame();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
