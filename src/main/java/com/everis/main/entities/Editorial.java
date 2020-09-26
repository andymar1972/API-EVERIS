package com.everis.main.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "editorial")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Editorial extends Base {
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "anio")
	private int anio;
	@Column(name = "idioma")
	private String idioma;
	// @OneToMany(mappedBy = "editorial")
	// @JoinTable(name = "editorial_libro", joinColumns = @JoinColumn(name =
	// "editorial_id"), inverseJoinColumns = @JoinColumn(name = "libro_id"))
	// private List<Libro> libros = new ArrayList<Libro>();
}
