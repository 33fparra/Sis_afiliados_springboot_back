/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Repository;

import com.example.finalPatrones.Entity.Scex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 *
 * @author el_pipe
 */
public interface ScexRepositorio extends JpaRepository<Scex, Integer> {
    List<Scex>findAll();
    Scex findById(int id);
    Scex save(Scex s);
    void delete(Scex s);
}
