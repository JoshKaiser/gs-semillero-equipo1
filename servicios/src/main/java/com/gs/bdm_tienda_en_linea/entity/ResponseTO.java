package com.gs.bdm_tienda_en_linea.entity;

import lombok.Data;

@Data
public class ResponseTO {

	private String hash;
	private String codigoOperacion;
	private String message;
	
	public ResponseTO() {
		
	}
	
	public ResponseTO(String hash, String codigoOperacion, String message) {
		this.hash = hash;
		this.codigoOperacion = codigoOperacion;
		this.message = message;
	}

	@Override
	public String toString() {
		return "RequestTO [hash=" + hash + ", codigoOperacion=" + codigoOperacion + ", message=" + message + "]";
	}
}
