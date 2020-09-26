package com.everis.main.services;

import org.springframework.stereotype.Service;

import com.everis.main.entities.Libro;
import com.everis.main.repositories.BaseRepository;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

	public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
