/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package mx.com.anzen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import mx.com.anzen.persistance.Usuario;

/**
 * <p>TODO [Add comments of the class]</p>
 * 
 * @author triana
 * @version tutorial-jpa
 * @since tutorial-jpa
 * @category
 */
@Component("userRepository")
public interface UserRepository extends CrudRepository<Usuario, Integer> {
}
