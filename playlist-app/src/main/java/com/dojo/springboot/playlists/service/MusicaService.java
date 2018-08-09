package com.dojo.springboot.playlists.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dojo.springboot.playlists.model.MusicaModel;


@FeignClient(name = "music-app")
public interface MusicaService {
	
	@RequestMapping(value = "/api/musicas/{id}" , method = RequestMethod.GET)
	public MusicaModel getById(@PathVariable("id") String id);
	
}
