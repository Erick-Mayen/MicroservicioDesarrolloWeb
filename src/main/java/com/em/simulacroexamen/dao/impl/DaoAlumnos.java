package com.em.simulacroexamen.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.em.simulacroexamen.dao.IDaoAlumnos;
import com.em.simulacroexamen.entity.Alumnos;

@Repository
@Transactional
public class DaoAlumnos implements IDaoAlumnos{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Alumnos> findAll() {
		try {
			List<Alumnos> listaAlumnos = em.createQuery("from Alumnos", Alumnos.class).getResultList();
			return listaAlumnos;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public Alumnos save(Alumnos alumno) {
		try {
			em.persist(alumno);
			return alumno;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Alumnos update(Alumnos alumno) {
		try {
			em.merge(alumno);
			return alumno;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
