package com.dojo.springboot.playlists.model;

import java.io.Serializable;

public class PlaylistMusicasModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -766785243776108405L;

	private String playlistId;

	private String musicaId;

	private MusicaModel musica;

	public String getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}

	public String getMusicaId() {
		return musicaId;
	}

	public void setMusicaId(String musicaId) {
		this.musicaId = musicaId;
	}

	public MusicaModel getMusica() {
		return musica;
	}

	public void setMusica(MusicaModel musica) {
		this.musica = musica;
	}
}
