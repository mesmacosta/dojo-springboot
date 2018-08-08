package com.dojo.springboot.musicas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dojo.springboot.musicas.entity.Musica;

public interface MusicaDao extends JpaRepository<Musica, String> {

	List<Musica> findMusicaByNomeContainingOrArtistaNomeContainingOrderByArtistaNomeAscNomeAsc(String nome,
			String nomeArtista);
}