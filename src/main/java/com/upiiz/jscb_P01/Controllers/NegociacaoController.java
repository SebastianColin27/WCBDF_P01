package com.upiiz.jscb_P01.Controllers;

import com.upiiz.jscb_P01.Models.*;
import com.upiiz.jscb_P01.Services.NegociacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/negociacoes")
public class NegociacaoController {

    NegociacaoService negociacaosServices ;

    public NegociacaoController(NegociacaoService negociacaosServices) {
        this.negociacaosServices = negociacaosServices;
    }

    //GET - todas los customers
    @GetMapping
    public ResponseEntity<List<Negociacao>> getAllNegociacao(){
        return ResponseEntity.ok(negociacaosServices.getAllNegociacao());
    }

    // GET - solo una categoria por id
    @GetMapping("/{id}")
    public ResponseEntity<Negociacao> getNegociacao(@PathVariable Long id){
        return ResponseEntity.ok(negociacaosServices.getNegociacaoById(id));
    }

    // POST - crear categoria
    @PostMapping
    public ResponseEntity<Negociacao> addNegociacao(@RequestBody Negociacao negociacao){
        return ResponseEntity.ok(negociacaosServices.createNegociacao(negociacao));
    }

    //PUT - actualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Negociacao> updateNegociacao(@RequestBody Negociacao negociacao, @PathVariable Long id){
        negociacao.setIdNegocio(id);
        return ResponseEntity.ok(negociacaosServices.updateNegociacao(negociacao));
    }

    //DELETE - eliminar categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNegociacao(@PathVariable Long id){
        negociacaosServices.deleteNegociacao(id);
        return ResponseEntity.noContent().build();
    }

    //GET BY ID cliente
    @GetMapping("/cliente/{idCliente}")
    public  ResponseEntity<List<Negociacao>> getNegociacaoByIdCliente(@PathVariable Long idCliente){
        return ResponseEntity.ok(this.negociacaosServices.getNegocioByIdCliente(idCliente));
    }

    //GET BY ID veiculo
    @GetMapping("/veiculo/{idVeiculo}")
    public  ResponseEntity<List<Negociacao>> getNegociacaoByIdVeiculo(@PathVariable Long idVeiculo){
        return ResponseEntity.ok(this.negociacaosServices.getNegocioByIdVeiculo(idVeiculo));
    }
}

