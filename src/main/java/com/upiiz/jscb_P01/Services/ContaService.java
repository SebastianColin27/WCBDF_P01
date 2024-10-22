

package com.upiiz.jscb_P01.Services;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Conta;
import com.upiiz.jscb_P01.Repository.ClienteRepository;
import com.upiiz.jscb_P01.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    ContaRepository contasRepository;

    public ContaService(ContaRepository contasRepository) {
        this.contasRepository = contasRepository;
    }

    //GET
    public List<Conta> getAllConta(){
        return contasRepository.obtenerTodos();
    }

    //GET -
    public Conta getContaById(Long id){
        return contasRepository.obtenerPorId(id);
    }

    //POST -
    public Conta createConta(Conta conta){
        return contasRepository.guardar(conta);
    }

    //PUT - actualizar customer
    public Conta updateConta(Conta conta){
        return contasRepository.actualizar(conta);
    }

    //DELETE - eliminar customer
    public void deleteConta(Long id){
        contasRepository.eliminar(id);
    }


    //buscar por id cliente
    public List<Conta> getContaByIdCliente(Long idCliente){
        return this.contasRepository.obtenerPorIdCliente(idCliente);
    }
}
