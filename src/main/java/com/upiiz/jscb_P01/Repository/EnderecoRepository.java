

package com.upiiz.jscb_P01.Repository;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Endereco;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class EnderecoRepository {

    private List<Endereco> enderecos= new ArrayList<Endereco>();
    private AtomicLong idEndereco= new AtomicLong();

    //POST
    public Endereco guardar(Endereco endereco){
        endereco.setIdEndereco(idEndereco.incrementAndGet());
        enderecos.add(endereco);
        return endereco;
    }

    //GET
    public List<Endereco> obtenerTodos() {

        return enderecos;
    }

    //GET BY ID
    public  Endereco obtenerPorId(Long id){

        return enderecos.stream().filter(endereco -> endereco.getIdEndereco().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Endereco actualizar(Endereco endereco){
        eliminar(endereco.getIdEndereco());
        enderecos.add(endereco);
        return endereco;
    }

    //DELETE
    public  void eliminar(Long id){
        enderecos.removeIf(endereco-> endereco.getIdEndereco().equals(id));
    }

    //buscar por id cliente
    public List<Endereco> obtenerPorIdCliente(Long idCliente){
        return this.enderecos.stream().filter(endereco -> endereco.getIdCliente().equals(idCliente)).collect(Collectors.toList());
    }

}
