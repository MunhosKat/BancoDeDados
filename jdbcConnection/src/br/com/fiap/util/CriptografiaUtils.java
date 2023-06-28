package br.com.fiap.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CriptografiaUtils {
	
	public static String criptografar (String senha) throws Exception {
		//OBTEM A INSTANCIA DE UM ALGORITMO
		MessageDigest md = MessageDigest.getInstance("MD5");
		//PASSA OS DADOS A SEREM CRIPTOGRAFADOS E ESTIPULA ENCODING PADRAO
		md.update(senha.getBytes("ISO-8859-1"));
		//GERA A CHAVE CRIPTOGRAFADA EM ARRAY DE BYTES PARA POSTERIOR HASHING
		BigInteger hash = new BigInteger (1, md.digest());
		// RETORNA A SENHA CRIPTOGRAFADA
		
		return hash.toString(16);
		
		
	}

}
