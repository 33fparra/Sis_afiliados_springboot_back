/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Scex;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author el_pipe
 */
@Service
public interface ScexService {
    List<Scex>Listar();
    Scex listarId(int id);
    Scex agregar(Scex s);
    Scex editar(Scex s);
    Scex eliminar(int id);
}
