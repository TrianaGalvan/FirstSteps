/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package mx.com.anzen.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.anzen.port.AccountPortTypeImpl;

/**
 * <p>TODO [Add comments of the class]</p>
 * 
 * @author triana
 * @version tutorial-api-soap
 * @since tutorial-api-soap
 * @category
 */
@Configuration
public class WSDLConfiguration {
	@Autowired
	private Bus bus; 
	
	
	@Autowired
	private AccountPortTypeImpl accountPortTypeImpl;
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, accountPortTypeImpl);
		endpoint.publish("/services/*");
		
		return endpoint;
	}
}
