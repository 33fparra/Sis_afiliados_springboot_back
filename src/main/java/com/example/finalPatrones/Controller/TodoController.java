package com.example.finalPatrones.Controller;

import com.example.finalPatrones.Entity.Login;
import com.example.finalPatrones.Entity.Scex;
import com.example.finalPatrones.Entity.Sipen;
import com.example.finalPatrones.Entity.Slafi;
import com.example.finalPatrones.Service.LoginService;
import com.example.finalPatrones.Service.ScexService;
import com.example.finalPatrones.Service.SipenService;
import com.example.finalPatrones.Service.SlafiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/API")
public class TodoController {
    @Autowired
    SlafiService slafi;

    @Autowired
    SipenService sipen;

    @Autowired
    ScexService scex;

    @Autowired
    LoginService login;


    @GetMapping("/slafi")
    public List<Slafi> listarSlafi(){
        return slafi.Listar();
    }

    @PostMapping("/slafi")
    public Slafi agregarSlafi(@RequestBody Slafi s){
        return slafi.agregar(s);
    }

    @GetMapping(path = {"/slafi/{id}"})
    public Slafi listarIdSlafi(int id){
    return slafi.listarId(id);
    }


    @PutMapping(path = {"/slafi/{id}"})
    public Slafi editarSlafi(@RequestBody Slafi s,@PathVariable("id")int id){
        s.setId(id);
        return slafi.editar(s);
    }

    @GetMapping("/sipen")
    public List<Sipen>listarSipen(){
        return sipen.Listar();
    }


    @GetMapping("/scex")
    public List<Scex>listarScex(){
        return scex.Listar();
    }


    @GetMapping("/login")
    public List<Login>listarUsuario(){
        return login.Listar();
    }
}
