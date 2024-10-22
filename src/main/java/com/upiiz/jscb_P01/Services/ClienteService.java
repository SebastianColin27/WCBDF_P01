
package com.upiiz.jscb_P01.Services;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ClienteService {


    ClienteRepository clientesRepository;

    public ClienteService(ClienteRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    //GET
    public List<Cliente> getAllCliente(){
        return clientesRepository.obtenerTodos();
    }

    //GET -
    public Cliente getClienteById(Long id){
        return clientesRepository.obtenerPorId(id);
    }

    //POST -
    public Cliente createCliente(Cliente cliente){
        return clientesRepository.guardar(cliente);
    }

    //PUT - actualizar customer
    public Cliente updateCliente(Cliente cliente){
        return clientesRepository.actualizar(cliente);
    }

    //DELETE - eliminar customer
    public void deleteCliente(Long id){
        clientesRepository.eliminar(id);
    }


    //buscar por id endereco
    public List<Cliente> getClienteByIdEndereco(Long idEndereco){
        return this.clientesRepository.obtenerPorIdEndereco(idEndereco);
    }
}
