package com.em.simulacroexamen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.simulacroexamen.dao.IDaoAlumnos;
import com.em.simulacroexamen.entity.Alumnos;

@RestController
@RequestMapping(value = "/apiAlumnos")
public class AlumnoController {
	
	@Autowired
	private IDaoAlumnos daoAlumnos;

	@GetMapping(value = "/alumnos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alumnos> getAlumnos(){
		return daoAlumnos.findAll();
		}
	
	
	@PostMapping(value = "/alumnos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Alumnos save(@RequestBody Alumnos alumno) {
		return daoAlumnos.save(alumno);
	}
	
	@PutMapping(value = "/alumnos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Alumnos update(@RequestBody Alumnos alumno) {
		return daoAlumnos.update(alumno);
	}
	
	}
