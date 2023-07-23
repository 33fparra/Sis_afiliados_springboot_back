/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Login;

import java.util.List;

/**
 *
 * @author el_pipe
 */

public interface LoginService {
    List<Login>Listar();
    Login listarId(int id);
    Login agregar(Login l);
    Login editar(Login l);
    Login eliminar(int id);
}
