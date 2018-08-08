package com.dojo.springboot.playlists.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dojo.springboot.playlists.entity.Playlist;

public interface PlaylistDao extends  JpaRepository<Playlist, String> {

   Playlist findPlaylistByUsuarioNome(String nome);
}