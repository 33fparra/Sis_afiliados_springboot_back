/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Sipen;

import com.example.finalPatrones.Sipen.Sipen;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 *
 * @author el_pipe
 */
@Service
public interface SipenService {
    List<Sipen>Listar();
    Sipen listarId(int id);
    Sipen agregar(Sipen s);
    Sipen editar(Sipen s);
    Sipen eliminar(int id);
}
