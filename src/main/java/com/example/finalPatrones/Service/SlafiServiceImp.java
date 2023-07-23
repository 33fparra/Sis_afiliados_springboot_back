/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Service;


import com.example.finalPatrones.Entity.Slafi;
import com.example.finalPatrones.Repository.SlafiRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author el_pipe
 */
@Service
public class SlafiServiceImp implements SlafiService{
    
    @Autowired
    private SlafiRepositorio repositorio;
    
    @Override
    public List<Slafi> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Slafi listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Slafi agregar(Slafi s){
        return repositorio.save(s);
    }
    
    @Override
    public Slafi editar(Slafi s){
        return repositorio.save(s); //verificar y poner un método válido
    }
    
    @Override
    public Slafi eliminar(int id){
        
        return null;   
    }
   
}
