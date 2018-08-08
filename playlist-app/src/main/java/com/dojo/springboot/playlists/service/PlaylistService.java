package com.dojo.springboot.playlists.service;

import com.dojo.springboot.playlists.model.PlaylistModel;

public interface PlaylistService {

	PlaylistModel getByUsuarioNome(String nome);
}
