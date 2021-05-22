package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;

@Service
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Override
	public List<Usuario> buscarUsuarios(String rol) {
		final List<Usuario> lista = repositorioUsuario.todos();
		
		if(lista.isEmpty()) {
			throw new RuntimeException("No hay usuarios en la base");
		}
		
		List<Usuario> listaFiltrada = new LinkedList<>();
		for(Usuario user : lista) {
			if(user.getRol().equals(rol)) {
				listaFiltrada.add(user);
			}
		}
		
		return listaFiltrada;
	}
	
}
