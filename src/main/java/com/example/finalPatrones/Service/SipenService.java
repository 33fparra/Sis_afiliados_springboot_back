/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Sipen;

import java.util.List;

/**
 *
 * @author el_pipe
 */

public interface SipenService {
    List<Sipen>Listar();
    Sipen listarId(int id);
    Sipen agregar(Sipen s);
    Sipen editar(Sipen s);
    Sipen eliminar(int id);
}
