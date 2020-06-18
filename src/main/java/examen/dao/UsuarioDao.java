package examen.dao;

import org.springframework.data.repository.CrudRepository;

import examen.model.Usuario;


public interface UsuarioDao 
extends CrudRepository<Usuario,Integer>{

}
