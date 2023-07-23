/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalPatrones.Service;

import com.example.finalPatrones.Entity.Scex;
import com.example.finalPatrones.Repository.ScexRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author el_pipe
 */
@Service
public class ScexServiceImp implements ScexService {
    @Autowired
    private ScexRepositorio repositorio;
    
    @Override
    public List<Scex> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Scex listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Scex agregar(Scex s){
        return repositorio.save(s);
    }
    
    @Override
    public Scex editar(Scex s){
        return repositorio.save(s); //verificar y poner un método válido
    }
    
    @Override
    public Scex eliminar(int id){
        
        return null;   
    }
}
