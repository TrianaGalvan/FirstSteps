/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V. Mexico D.F. All rights reserved. THIS
 * SOFTWARE IS CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES. THIS INFORMATION
 * SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE
 * COMPANY ITSELF.
 */
package mx.com.anzen.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.anzen.jpa.persistance.Usuario;
import mx.com.anzen.jpa.repository.UserRepository;
import mx.com.anzen.rest.model.ModeloUsuario;
import mx.com.anzen.rest.model.TranslatorUsuario;

/**
 * <p>TODO [Add comments of the class]</p> @author triana @version
 * tutorial-api-rest @since tutorial-api-rest @category
 */
@RestController
public class UserController {
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository repository; 
	
	@Autowired
	@Qualifier("translatorUsuario")
	private TranslatorUsuario translator; 
	
	@PostMapping("/accounts")
	public ResponseEntity<ModeloUsuario> registrarUsuario(@RequestBody ModeloUsuario modelo){
		Usuario usuario = translator.modeloAPersistencia(modelo);
		Usuario usuarioCreado = repository.save(usuario);
		ModeloUsuario response = translator.persistenciaAModelo(usuarioCreado);
		return new ResponseEntity<>(response, HttpStatus.CREATED); 
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<ModeloUsuario> getUsuario(@PathVariable(value = "id") String id){
		Usuario usuario = repository.findOne(Integer.parseInt(id)); 
		if(usuario == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
		ModeloUsuario response = translator.persistenciaAModelo(usuario);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<?> getUsuarios(){
		Iterable<Usuario> usuarios =  repository.findAll();
		if(usuarios.spliterator().getExactSizeIfKnown() == 0) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
		}
		return new ResponseEntity<>(usuarios, HttpStatus.OK); 
		
	}
	
}
