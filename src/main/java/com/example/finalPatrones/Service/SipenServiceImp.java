/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Sipen;
import com.example.finalPatrones.Repository.SipenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author el_pipe
 */
@Service
public class SipenServiceImp implements SipenService {
    
    @Autowired
    private SipenRepositorio repositorio;
    
     @Override
    public List<Sipen> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Sipen listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Sipen agregar(Sipen s){
        return repositorio.save(s);
    }
    
    @Override
    public Sipen editar(Sipen s){
        return repositorio.save(s); //verificar y poner un método válido
    }
    
    @Override
    public Sipen eliminar(int id){
        
        return null;   
    }
}
