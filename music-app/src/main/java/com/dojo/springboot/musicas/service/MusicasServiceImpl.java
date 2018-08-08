package com.dojo.springboot.musicas.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.dojo.springboot.musicas.dao.MusicaDao;
import com.dojo.springboot.musicas.entity.Musica;

@Component
public class MusicasServiceImpl implements MusicasService {

	@Autowired
	private MusicaDao dao;


	@Override
	public List<Musica> getMusicas() {
		return dao.findAll();
	}	

	@Override
	@Cacheable("musicaByFilter")
	public List<Musica> getMusicasByNomeMusicaOrArtista(String nome) {
		return dao.findMusicaByNomeContainingOrArtistaNomeContainingOrderByArtistaNomeAscNomeAsc(nome, nome);
	}

	@Override
	@Cacheable("musicaByID")
	public Musica getMusica(String id) {
		Optional<Musica> musica = dao.findById(id);
		return musica.orElse(null);
	}
	
}

