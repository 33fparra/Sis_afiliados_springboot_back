/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Repository;

import com.example.finalPatrones.Entity.Slafi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author el_pipe
 */

public interface SlafiRepositorio extends JpaRepository<Slafi, Integer> {
    
    List<Slafi> findAll();
    Slafi findById(int id);
    Slafi save(Slafi s);
    void delete(Slafi s);
}
