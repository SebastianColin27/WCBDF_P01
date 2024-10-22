

package com.upiiz.jscb_P01.Repository;

import com.upiiz.jscb_P01.Models.Cliente;
import com.upiiz.jscb_P01.Models.Veiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class VeiculoRepository {

    // Consulta personalizada para buscar vehículos por cliente



    private List<Veiculo> veiculos= new ArrayList<Veiculo>();
    private AtomicLong idVeiculo= new AtomicLong();

    //POST
    public Veiculo guardar(Veiculo veiculo){
        veiculo.setIdVeiculo(idVeiculo.incrementAndGet());
        veiculos.add(veiculo);
        return veiculo;
    }

    //GET
    public List<Veiculo> obtenerTodos() {

        return veiculos;
    }

    //GET BY ID
    public  Veiculo obtenerPorId(Long id){

        return veiculos.stream().filter(veiculo -> veiculo.getIdVeiculo().equals(id)).findFirst().orElse(null)  ;
    }

    //PUT
    public Veiculo actualizar(Veiculo veiculo){
        eliminar(veiculo.getIdVeiculo());
        veiculos.add(veiculo);
        return veiculo;
    }

    //DELETE
    public  void eliminar(Long id){
        veiculos.removeIf(veiculo-> veiculo.getIdVeiculo().equals(id));
    }


    //buscar por id cliente
    public List<Veiculo> obtenerPorIdCliente(Long idCliete){
        return this.veiculos.stream().filter(veiculo -> veiculo.getIdCliente().equals(idCliete)).collect(Collectors.toList());
    }
}