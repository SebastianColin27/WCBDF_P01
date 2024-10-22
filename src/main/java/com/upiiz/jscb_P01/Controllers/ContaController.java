

package com.upiiz.jscb_P01.Controllers;


import com.upiiz.jscb_P01.Models.Conta;
import com.upiiz.jscb_P01.Services.ContaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contas")
public class ContaController {
    ContaService contasServices ;

    public  ContaController( ContaService  contasServices) {
        this.contasServices = contasServices;
    }

    //GET - todas los customers
    @GetMapping
    public ResponseEntity<List<Conta>> getAllContas(){
        return ResponseEntity.ok(contasServices.getAllConta());
    }

    // GET - solo una categoria por id
    @GetMapping("/{id}")
    public ResponseEntity<Conta> getConta(@PathVariable Long id){
        return ResponseEntity.ok(contasServices.getContaById(id));
    }

    // POST - crear categoria
    @PostMapping
    public ResponseEntity<Conta> addConta(@RequestBody Conta conta){
        return ResponseEntity.ok(contasServices.createConta(conta));
    }

    //PUT - actualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Conta> updateConta(@RequestBody Conta conta, @PathVariable Long id){
        conta.setIdConta(id);
        return ResponseEntity.ok(contasServices.updateConta(conta));
    }

    //DELETE - eliminar categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConta(@PathVariable Long id){
        contasServices.deleteConta(id);
        return ResponseEntity.noContent().build();
    }

    //GET BY ID cliente
    @GetMapping("/cliente/{idCliente}")
    public  ResponseEntity<List<Conta>> getContaByIdCliente(@PathVariable Long idCliente){
        return ResponseEntity.ok(this.contasServices.getContaByIdCliente(idCliente));
    }

}
