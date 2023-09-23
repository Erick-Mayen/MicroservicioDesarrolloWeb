package com.em.simulacroexamen.dao;

import java.util.List;

import com.em.simulacroexamen.entity.Alumnos;

public interface IDaoAlumnos {
	public List<Alumnos> findAll();
	public Alumnos save(Alumnos alumno);
	public Alumnos update(Alumnos alumno);

}
