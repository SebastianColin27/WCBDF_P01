
package com.upiiz.jscb_P01.Controllers;

import com.upiiz.jscb_P01.Models.Veiculo;
import com.upiiz.jscb_P01.Services.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/veiculos")
public class VeiculoController {

    VeiculoService veiculosServices ;

    public VeiculoController(VeiculoService veiculosServices) {
        this.veiculosServices = veiculosServices;
    }

    //GET - todas los customers
    @GetMapping
    public ResponseEntity<List<Veiculo>> getAllVeiculo(){
        return ResponseEntity.ok(veiculosServices.getAllVeiculo());
    }

    // GET - solo una categoria por id
    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable Long id){
        return ResponseEntity.ok(veiculosServices.getVeiculoById(id));
    }

    // POST - crear categoria
    @PostMapping
    public ResponseEntity<Veiculo> addVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.ok(veiculosServices.createVeiculo(veiculo));
    }

    //PUT - actualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@RequestBody Veiculo veiculo, @PathVariable Long id){
        veiculo.setIdVeiculo(id);
        return ResponseEntity.ok(veiculosServices.updateVeiculo(veiculo));
    }

    //DELETE - eliminar categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable Long id){
        veiculosServices.deleteVeiculo(id);
        return ResponseEntity.noContent().build();
    }

    //GET BY ID cliente
    @GetMapping("/cliente/{idCliente}")
    public  ResponseEntity<List<Veiculo>> getVeiculoByIdCliente(@PathVariable Long idCliente){
        return ResponseEntity.ok(this.veiculosServices.getVeiculoByIdCliente(idCliente));
    }
}
