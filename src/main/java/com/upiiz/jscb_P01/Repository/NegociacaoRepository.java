

package com.upiiz.jscb_P01.Repository;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Negociacao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class NegociacaoRepository {
    // Consulta personalizada para obtener negociaciones por cliente


    private List<Negociacao> negociacaos= new ArrayList<Negociacao>();
    private AtomicLong idNegocio= new AtomicLong();



    //POST
    public Negociacao guardar(Negociacao negociacao){
        negociacao.setIdNegocio(idNegocio.incrementAndGet());
        negociacaos.add(negociacao);
        return negociacao;
    }

    //GET
    public List<Negociacao> obtenerTodos() {

        return negociacaos;
    }

    //GET BY ID
    public  Negociacao obtenerPorId(Long id){

        return negociacaos.stream().filter(negociacao -> negociacao.getIdNegocio().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Negociacao actualizar(Negociacao negociacao){
        eliminar(negociacao.getIdNegocio());
        negociacaos.add(negociacao);
        return negociacao;
    }

    //DELETE
    public  void eliminar(Long id){
        negociacaos.removeIf(negociacao-> negociacao.getIdNegocio().equals(id));
    }

    //buscar por id cliente
    public List<Negociacao> obtenerPorIdCliete(Long idCliente){
        return this.negociacaos.stream().filter(cliente -> cliente.getIdCliente().equals(idCliente)).collect(Collectors.toList());
    }

    //buscar por id veiculo
    public List<Negociacao> obtenerPorIdVeiculo(Long idVeiculo){
        return this.negociacaos.stream().filter(negociacao -> negociacao.getIdVeiculo().equals(idVeiculo)).collect(Collectors.toList());
    }

}
