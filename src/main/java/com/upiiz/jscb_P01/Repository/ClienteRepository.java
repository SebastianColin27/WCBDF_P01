
package com.upiiz.jscb_P01.Repository;

import com.upiiz.jscb_P01.Models.Cliente;
import org.springframework.stereotype.Repository;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class ClienteRepository {


    private List<Cliente> clientes= new ArrayList<Cliente>();
    private AtomicLong idCliente= new AtomicLong();

    //POST
    public Cliente guardar(Cliente cliente){
        cliente.setIdCliente(idCliente.incrementAndGet());
        clientes.add(cliente);
        return cliente;
    }

    //GET
    public List<Cliente> obtenerTodos() {

        return clientes;
    }

    //GET BY ID
    public Cliente obtenerPorId(Long id){

        return clientes.stream().filter(cliente -> cliente.getIdCliente().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Cliente actualizar(Cliente cliente){
        eliminar(cliente.getIdCliente());
        clientes.add(cliente);
        return cliente;
    }

    //DELETE
    public  void eliminar(Long id){
        clientes.removeIf(producto-> producto.getIdCliente().equals(id));
    }


    //buscar por id endereco
    public List<Cliente> obtenerPorIdEndereco(Long idEndereco){
        return this.clientes.stream().filter(cliente -> cliente.getIdEndereco().equals(idEndereco)).collect(Collectors.toList());
    }

}
