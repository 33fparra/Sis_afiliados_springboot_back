/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Scex;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author el_pipe
 */
@Entity
@Table(name = "scex")
public class Scex implements Serializable{
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String exclusion; //seleccionar una (realizar un select o algo similar
    @Column
    private int edad;
    @Column
    private int pension;
    @Column
    private String afp; //select (tres opciones) en front y bd

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExclusion() {
        return exclusion;
    }

    public void setExclusion(String exclusion) {
        this.exclusion = exclusion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
    
    
}
