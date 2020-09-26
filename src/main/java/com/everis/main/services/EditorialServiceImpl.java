package com.everis.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.main.entities.Editorial;
import com.everis.main.repositories.BaseRepository;
import com.everis.main.repositories.EditorialRepository;

@Service
public class EditorialServiceImpl extends BaseServiceImpl<Editorial, Long> implements EditorialService {

	@Autowired
	private EditorialRepository editorialRepository;

	public EditorialServiceImpl(BaseRepository<Editorial, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
