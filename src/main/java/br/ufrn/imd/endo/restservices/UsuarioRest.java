package br.ufrn.imd.endo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.imd.endo.dominio.Usuario;
import br.ufrn.imd.endo.repositorios.UsuarioRepositorio;

@RestController
public class UsuarioRest {

	@Autowired
	private UsuarioRepositorio repositorio;

	@RequestMapping("/usuarios")
	public Usuario greeting(@RequestParam(value = "email") String email) {
		List<Usuario> usuarios = repositorio.findByEmail(email);
		return usuarios != null && !usuarios.isEmpty() ? usuarios.get(0) : null;
	}
	
}
