package br.com.fabricadeprogramador.fabricaweb;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.*;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testCadastrar() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setNome("JãoZão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com Sucesso!");
	}
	
	public static void testAlterar() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("JãoZão da Silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");
		
		//Alterando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com Sucesso!");
	}
	
	public static void testExcluir() {
		// Criando usuario
		Usuario usu = new Usuario();
		usu.setId(4);
				
		//Alterando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Deletado com Sucesso!");
	}
}
