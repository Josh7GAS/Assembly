package br.com.bandtec.AgendaDeObjetivos.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//acessando H2 via CMD: java -cp h2-1.4.199.jar org.h2.tools.Server

@Repository
public interface TodosUsuarios  extends JpaRepository<Usuario, Long>{
	
//	@Query("select u from Usuario u where u..login = :login and u.senha = :senha")
	@Query("select u from Usuario u where u.credenciais = :credenciais")
	public Usuario existe(@Param("credenciais") Credenciais credenciais);
	
	@Query("select u from Usuario u where u.nome = :nome")
	public List<Usuario> obterPorNome(@Param("nome") String nome);
	
	@Query("select u from Usuario u where u.idade = :idade")
	public List<Usuario> obterPorIdade(@Param("idade") Integer idadeProcurada);
	
	
}
