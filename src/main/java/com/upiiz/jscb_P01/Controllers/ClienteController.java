

package com.upiiz.jscb_P01.Controllers;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {

    ClienteService clientesServices ;

    public ClienteController(ClienteService clienteServices) {
        this.clientesServices = clienteServices;
    }

    //GET - todas los customers
    @GetMapping
    public ResponseEntity<List<Cliente>> getAllCliente(){
        return ResponseEntity.ok(clientesServices.getAllCliente());
    }

    // GET - solo una categoria por id
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id){
        return ResponseEntity.ok(clientesServices.getClienteById(id));
    }

    // POST - crear categoria
    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clientesServices.createCliente(cliente));
    }

    //PUT - actualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setIdCliente(id);
        return ResponseEntity.ok(clientesServices.updateCliente(cliente));
    }

    //DELETE - eliminar categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id){
        clientesServices.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }

    //GET BY ID ENDERECO
    @GetMapping("/endereco/{idEndereco}")
    public  ResponseEntity<List<Cliente>> getClienteByIdEndereco(@PathVariable Long idEndereco){
        return ResponseEntity.ok(this.clientesServices.getClienteByIdEndereco(idEndereco));
    }

}
