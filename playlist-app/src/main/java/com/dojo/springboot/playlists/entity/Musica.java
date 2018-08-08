package com.dojo.springboot.playlists.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Musicas")  
public class Musica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4436032799597928128L;

	@Id
	@Column(name = "Id")
	private String id;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
