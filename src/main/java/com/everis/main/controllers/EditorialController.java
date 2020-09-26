package com.everis.main.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.main.entities.Editorial;
import com.everis.main.services.EditorialServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/editoriales")
public class EditorialController extends BaseControllerImpl<Editorial, EditorialServiceImpl> {

}
