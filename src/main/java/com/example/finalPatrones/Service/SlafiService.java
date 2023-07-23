/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Slafi;

import java.util.List;

/**
 *
 * @author el_pipe
 */

public interface SlafiService {
    
    List<Slafi>Listar();
    Slafi listarId(int id);
    Slafi agregar(Slafi s);
    Slafi editar(Slafi s);
    Slafi eliminar(int id);
    
}
