package com.dojo.springboot.musicas.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Artistas")
public class Artista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4020446369049685722L;

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Nome")
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

