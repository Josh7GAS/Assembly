package br.com.bandtec.AgendaDeObjetivos.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.bandtec.AgendaDeObjetivos.model.Credenciais;
import br.com.bandtec.AgendaDeObjetivos.model.Usuario;


public interface TodosUsuarios  extends JpaRepository<Usuario, Long>{
	@Query("select u from Usuario u where u.credenciais = :credenciais")
	public Usuario existe(@Param("credenciais") Credenciais credenciais);

	@Query("select u from Usuario u where u.nome = :nome")
	public List<Usuario> obterPorNome(@Param("nome") String nome);

	@Query("select u from Usuario u where u.idade = :idade")
	public List<Usuario> obterPorIdade(@Param("idade") Integer idadeProcurada);
}

