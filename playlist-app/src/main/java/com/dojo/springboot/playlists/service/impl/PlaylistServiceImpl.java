package com.dojo.springboot.playlists.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dojo.springboot.playlists.dao.PlaylistDao;
import com.dojo.springboot.playlists.entity.Musica;
import com.dojo.springboot.playlists.entity.Playlist;
import com.dojo.springboot.playlists.entity.Usuario;
import com.dojo.springboot.playlists.model.PlaylistModel;
import com.dojo.springboot.playlists.model.PlaylistMusicasModel;
import com.dojo.springboot.playlists.model.UsuarioModel;
import com.dojo.springboot.playlists.service.MusicaService;
import com.dojo.springboot.playlists.service.PlaylistService;

@Component
public class PlaylistServiceImpl implements PlaylistService {

	@Autowired
	private PlaylistDao dao;

	@Autowired
	private MusicaService musicaService;
	
	@Override
	@Transactional(readOnly = true)
	public PlaylistModel getByUsuarioNome(String nome) {
		Playlist playlist = dao.findPlaylistByUsuarioNome(nome);
		if (playlist != null) {
			return buildModel(playlist);
		}
		return null;
	}

	private PlaylistModel buildModel(Playlist playlist) {
		PlaylistModel model = new PlaylistModel();
		model.setId(playlist.getId());
		model.setPlaylistMusicas(buildPlaylistMusicas(playlist.getMusicas(), playlist));
		model.setUsuario(buildUsuario(playlist.getUsuario()));
		return model;
	}

	private List<PlaylistMusicasModel> buildPlaylistMusicas(List<Musica> musicas, Playlist playlist) {
		List<PlaylistMusicasModel> playlistMusicas = new ArrayList<PlaylistMusicasModel>();
		if (musicas != null) {
			for (Musica musica : musicas) {
				playlistMusicas.add(buildPlaylistMusica(musica, playlist));
			}
		}
		return playlistMusicas;
	}

	private PlaylistMusicasModel buildPlaylistMusica(Musica musica, Playlist playlist) {
		PlaylistMusicasModel playlistMusica = new PlaylistMusicasModel();
		String musicaId = musica.getId();
		playlistMusica.setMusicaId(musicaId);
		playlistMusica.setMusica(musicaService.getById(musicaId));
		playlistMusica.setPlaylistId(playlist.getId());
		return playlistMusica;
	}

	private UsuarioModel buildUsuario(Usuario usuario) {
		UsuarioModel model = new UsuarioModel();
		model.setId(usuario.getId());
		model.setNome(usuario.getNome());
		model.setPlaylistId(usuario.getPlaylistId());
		return model;
	}

}
