package br.ufrn.imd.endo.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufrn.imd.endo.dominio.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer>{
	
	public List<Usuario> findByEmail(String email);


}
