

package com.upiiz.jscb_P01.Services;

import com.upiiz.jscb_P01.Models.Negociacao;
import com.upiiz.jscb_P01.Models.Veiculo;
import com.upiiz.jscb_P01.Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    VeiculoRepository veiculosRepository;

    public VeiculoService(VeiculoRepository veiculosRepository) {
        this.veiculosRepository = veiculosRepository;
    }

    //GET
    public List<Veiculo> getAllVeiculo(){
        return veiculosRepository.obtenerTodos();
    }

    //GET -
    public Veiculo getVeiculoById(Long id){
        return veiculosRepository.obtenerPorId(id);
    }

    //POST -
    public Veiculo createVeiculo(Veiculo veiculo){
        return veiculosRepository.guardar(veiculo);
    }

    //PUT - actualizar customer
    public Veiculo updateVeiculo(Veiculo veiculo){
        return veiculosRepository.actualizar(veiculo);
    }

    //DELETE - eliminar customer
    public void deleteVeiculo(Long id){
        veiculosRepository.eliminar(id);
    }

    //buscar por id cliente
    public List<Veiculo> getVeiculoByIdCliente(Long idCliente){
        return this.veiculosRepository.obtenerPorIdCliente(idCliente);
    }

}