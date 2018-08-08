package com.dojo.springboot.musicas.service;

import java.util.List;

import com.dojo.springboot.musicas.entity.Musica;

public interface MusicasService {

	List<Musica> getMusicas();
	
	Musica getMusica(String id);

	List<Musica> getMusicasByNomeMusicaOrArtista(String nome);
}
