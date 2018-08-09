package com.dojo.springboot.playlists.model;

import java.io.Serializable;

public class ArtistaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4020446369049685722L;

	private String id;

	private String nome;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

