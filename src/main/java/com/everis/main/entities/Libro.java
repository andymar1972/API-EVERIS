package com.everis.main.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "fecha")
	private int fecha;
	@Column(name = "genero")
	private String genero;
	@Column(name = "paginas")
	private int paginas;
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Editorial editorial;

}
