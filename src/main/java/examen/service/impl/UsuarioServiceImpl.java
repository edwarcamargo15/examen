package examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import examen.commons.GenericServiceImpl;
import examen.dao.UsuarioDao;
import examen.model.Usuario;
import examen.service.UsuarioService;

public class UsuarioServiceImpl
extends GenericServiceImpl<Usuario, Integer>
implements UsuarioService{

	public UsuarioServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UsuarioDao usuarioDao;


	@Override
	public CrudRepository<Usuario, Integer> getDao() {
		// TODO Auto-generated method stub
		return usuarioDao;
	}

}
