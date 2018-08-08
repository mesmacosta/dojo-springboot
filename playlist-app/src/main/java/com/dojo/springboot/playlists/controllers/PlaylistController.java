package com.dojo.springboot.playlists.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.playlists.model.PlaylistModel;
import com.dojo.springboot.playlists.service.PlaylistService;

@RestController
@CrossOrigin
@RequestMapping("/api/playlists")
public class PlaylistController {

	@Autowired
	private PlaylistService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlaylistModel> getByUser(@RequestParam("user") String user) {
		return ResponseEntity.ok(service.getByUsuarioNome(user));
	}

	@PutMapping(value = "/{playlistId}/musicas", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void addMusics() {

	}

	@DeleteMapping(value = "/{playlistId}/musicas/{musicaId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteMusic() {

	}
}

