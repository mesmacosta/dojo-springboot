package com.dojo.springboot.musicas.controllers;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.musicas.entity.Musica;
import com.dojo.springboot.musicas.service.MusicasService;

@RestController
@CrossOrigin
@RequestMapping("/api/musicas")
@Validated
public class MusicasController {

	@Autowired
	private MusicasService musicaService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Musica>> getByFilter(	@Size(min = 3, message = "filtro deve conter no min 3 caracteres") @RequestParam("filtro") String filtro) {
		List<Musica> musicas = musicaService.getMusicasByNomeMusicaOrArtista(filtro);
		return ResponseEntity.ok(musicas);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path= "/{id}")
	public ResponseEntity<Musica> getById(@PathVariable("id") String id) {
		return ResponseEntity.ok(musicaService.getMusica(id));
	}

}
