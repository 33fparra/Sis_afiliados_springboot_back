/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Repository;

import com.example.finalPatrones.Entity.Sipen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 *
 * @author el_pipe
 */
public interface SipenRepositorio extends JpaRepository<Sipen, Integer> {
    List<Sipen>findAll();
    Sipen findById(int id);
    Sipen save(Sipen s);
    void delete(Sipen s);
}
