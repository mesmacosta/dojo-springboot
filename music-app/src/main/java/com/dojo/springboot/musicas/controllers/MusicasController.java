package com.dojo.springboot.musicas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.musicas.entity.Musica;

@RestController
@CrossOrigin
@RequestMapping("/api/musicas")
public class MusicasController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Musica>> getByFilter(@RequestParam("filtro") String filtro) {
		List<Musica> musicas = new ArrayList<>();
		return ResponseEntity.ok(musicas);
	}

}
