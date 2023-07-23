/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Repository;

import com.example.finalPatrones.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 *
 * @author el_pipe
 */
public interface LoginRepositorio extends JpaRepository<Login, Integer>{
    List<Login>findAll();
    Login findById(int id);
    Login save(Login l);
    void delete(Login l);
}
