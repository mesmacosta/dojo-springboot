package com.dojo.springboot.playlists.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.springboot.playlists.model.PlaylistModel;

@RestController
@CrossOrigin
@RequestMapping("/api/playlists")
public class PlaylistController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlaylistModel> getByUser(@RequestParam("user") String user) {
		PlaylistModel playlistModel = new PlaylistModel();
		return ResponseEntity.ok(playlistModel);
	}

}
