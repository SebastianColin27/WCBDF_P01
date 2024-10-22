package com.upiiz.jscb_P01.Controllers;


import com.upiiz.jscb_P01.Models.Endereco;
import com.upiiz.jscb_P01.Services.EnderecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/enderecos")
public class EnderecoController {

    EnderecoService enderecosServices ;

    public EnderecoController(EnderecoService enderecosServices) {
        this.enderecosServices = enderecosServices;
    }

    //GET - todas los customers
    @GetMapping
    public ResponseEntity<List<Endereco>> getAllEndereco(){
        return ResponseEntity.ok(enderecosServices.getAllEndereco());
    }

    // GET - solo una categoria por id
    @GetMapping("/{id}")
    public ResponseEntity<Endereco> getEndereco(@PathVariable Long id){
        return ResponseEntity.ok(enderecosServices.getEnderecoById(id));
    }

    // POST - crear categoria
    @PostMapping
    public ResponseEntity<Endereco> addEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.ok(enderecosServices.createEndereco(endereco));
    }

    //PUT - actualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Endereco> updateEndereco(@RequestBody Endereco endereco, @PathVariable Long id){
        endereco.setIdEndereco(id);
        return ResponseEntity.ok(enderecosServices.updateEndereco(endereco));
    }

    //DELETE - eliminar categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable Long id){
        enderecosServices.deleteEndereco(id);
        return ResponseEntity.noContent().build();
    }

    //GET BY ID cliente
    @GetMapping("/cliente/{idCliente}")
    public  ResponseEntity<List<Endereco>> getEnderecoByIdCliente(@PathVariable Long idCliente){
        return ResponseEntity.ok(this.enderecosServices.getEnderecoByIdCliente(idCliente));
    }
}
