package com.em.simulacroexamen.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "alumno")
@Data
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private int id_alumno;
    private String nombre;
    private String apellido;
    private String sexo;
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;
    private int tipo_persona;
    private float sueldo;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date fecha_crea;
    private String status;
    
}