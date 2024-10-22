
package com.upiiz.jscb_P01.Services;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Endereco;
import com.upiiz.jscb_P01.Repository.ClienteRepository;
import com.upiiz.jscb_P01.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EnderecoService {
    EnderecoRepository enderecosRepository;

    public EnderecoService(EnderecoRepository enderecosRepository) {
        this.enderecosRepository = enderecosRepository;
    }

    //GET
    public List<Endereco> getAllEndereco(){
        return enderecosRepository.obtenerTodos();
    }

    //GET -
    public Endereco getEnderecoById(Long id){
        return enderecosRepository.obtenerPorId(id);
    }

    //POST -
    public Endereco createEndereco(Endereco endereco){
        return enderecosRepository.guardar(endereco);
    }

    //PUT - actualizar customer
    public Endereco updateEndereco(Endereco endereco){
        return enderecosRepository.actualizar(endereco);
    }

    //DELETE - eliminar customer
    public void deleteEndereco(Long id){
        enderecosRepository.eliminar(id);
    }

    //buscar por id cliente
    public List<Endereco> getEnderecoByIdCliente(Long idCliente){
        return this.enderecosRepository.obtenerPorIdCliente(idCliente);
    }

}
