package br.org.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/**
	 * Método que busca um usuário pelo seu usuario (email).
	 * 
	 * select * from tb_usuarios where usuario = "usuario procurado"
	 */
	public Optional<Usuario> findByUsuario(String usuario);

	/** 
	 * Usaremos na Sessão de Testes
	 * 
	 * select * from tb_usuarios where nome like "%nome procurado%"
	 */
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	/** 
	 * Usaremos na Sessão de Testes
	 * 
	 * select * from tb_usuarios where nome = "nome procurado"
	 */
	public Usuario findByNome(String nome);

}