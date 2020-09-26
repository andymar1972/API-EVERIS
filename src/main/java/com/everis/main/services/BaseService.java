package com.everis.main.services;

import java.io.Serializable;
import java.util.List;

import com.everis.main.entities.Base;

public interface BaseService<E extends Base, ID extends Serializable> {
	public List<E> findAll() throws Exception;

	public E findById(ID id) throws Exception;

	public E save(E entidad) throws Exception;

	public E update(ID id, E entity) throws Exception;

	public boolean delete(ID id) throws Exception;
}
