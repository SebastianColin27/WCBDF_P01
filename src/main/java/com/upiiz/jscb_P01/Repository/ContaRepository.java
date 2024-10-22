

package com.upiiz.jscb_P01.Repository;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class ContaRepository {


    private List<Conta> contas= new ArrayList<Conta>();
    private AtomicLong idConta= new AtomicLong();

    //POST
    public Conta guardar(Conta conta){
        conta.setIdConta(idConta.incrementAndGet());
        contas.add(conta);
        return conta;
    }

    //GET
    public List<Conta> obtenerTodos() {

        return contas;
    }

    //GET BY ID
    public  Conta obtenerPorId(Long id){

        return contas.stream().filter(conta -> conta.getIdConta().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Conta actualizar(Conta conta){
        eliminar(conta.getIdConta());
        contas.add(conta);
        return conta;
    }

    //DELETE
    public  void eliminar(Long id){
        contas.removeIf(conta-> conta.getIdConta().equals(id));
    }

    //buscar por id cliente
    public List<Conta> obtenerPorIdCliente(Long idCliente){
        return this.contas.stream().filter(conta -> conta.getIdCliente().equals(idCliente)).collect(Collectors.toList());
    }
}