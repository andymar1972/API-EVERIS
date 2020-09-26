package com.everis.main.repositories;

import org.springframework.stereotype.Repository;

import com.everis.main.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

}
