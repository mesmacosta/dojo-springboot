package com.dojo.springboot.playlists.model;

import java.io.Serializable;

public class MusicaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4436032799597928128L;

	private String id;

	private String nome;

	private String artistaId;

	private ArtistaModel artista;

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

	public ArtistaModel getArtista() {
		return artista;
	}

	public void setArtista(ArtistaModel artista) {
		this.artista = artista;
	}

	public String getArtistaId() {
		return artistaId;
	}

	public void setArtistaId(String artistaId) {
		this.artistaId = artistaId;
	}
}
