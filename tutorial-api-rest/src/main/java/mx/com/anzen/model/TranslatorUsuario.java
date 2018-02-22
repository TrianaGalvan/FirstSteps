/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package mx.com.anzen.model;

import org.springframework.stereotype.Component;

import mx.com.anzen.persistance.Usuario;

/**
 * <p>TODO [Add comments of the class]</p>
 * 
 * @author triana
 * @version tutorial-api-rest
 * @since tutorial-api-rest
 * @category
 */
@Component("translatorUsuario")
public class TranslatorUsuario {
	
	public Usuario modeloAPersistencia(ModeloUsuario modelo) {
		Usuario usuario = new Usuario(modelo.getPassword(), modelo.getLogin(), modelo.getName());
		usuario.setId(Integer.parseInt(modelo.getId()));
		return usuario; 
	}
	
	public ModeloUsuario persistenciaAModelo(Usuario usuario) {
		ModeloUsuario modelo = new ModeloUsuario(); 
		modelo.setId(usuario.getId().toString());
		modelo.setLogin(usuario.getLogin());
		modelo.setName(usuario.getName());
		modelo.setPassword(usuario.getPassword());
		return modelo; 
	}
}
