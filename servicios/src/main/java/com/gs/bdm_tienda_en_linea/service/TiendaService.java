package com.gs.bdm_tienda_en_linea.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gs.bdm_tienda_en_linea.business.RegistroClienteBusiness;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin
@RestController
@Slf4j
@RequestMapping(value="/api/bdm/tiendapp")
public class TiendaService {

	@Autowired
	RegistroClienteBusiness registroCliente;
	
	@RequestMapping(value="registrodeusuario", method=RequestMethod.POST, consumes=MediaType.TEXT_PLAIN_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> registrarCliente(@RequestBody String request, HttpServletRequest httpServlet){
		return (ResponseEntity<String>) registroCliente.registrarCliente(request, httpServlet.getSession(false));
	}
	

}