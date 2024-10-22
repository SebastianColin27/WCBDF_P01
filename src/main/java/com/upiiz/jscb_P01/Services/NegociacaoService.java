


package com.upiiz.jscb_P01.Services;

import com.upiiz.jscb_P01.Models.Endereco;
import com.upiiz.jscb_P01.Models.Negociacao;
import com.upiiz.jscb_P01.Repository.EnderecoRepository;
import com.upiiz.jscb_P01.Repository.NegociacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegociacaoService {
    NegociacaoRepository negociacaosRepository;

    public NegociacaoService(NegociacaoRepository negociacaosRepository) {
        this.negociacaosRepository = negociacaosRepository;
    }

    //GET
    public List<Negociacao> getAllNegociacao(){
        return negociacaosRepository.obtenerTodos();
    }

    //GET -
    public Negociacao getNegociacaoById(Long id){
        return negociacaosRepository.obtenerPorId(id);
    }

    //POST -
    public Negociacao createNegociacao(Negociacao negociacao){
        return negociacaosRepository.guardar(negociacao);
    }

    //PUT - actualizar customer
    public Negociacao updateNegociacao(Negociacao negociacao){
        return negociacaosRepository.actualizar(negociacao);
    }

    //DELETE - eliminar customer
    public void deleteNegociacao(Long id){
        negociacaosRepository.eliminar(id);
    }

    //buscar por id cliente
    public List<Negociacao> getNegocioByIdCliente(Long idCliente){
        return this.negociacaosRepository.obtenerPorIdCliete(idCliente);
    }

    //buscar por id veiculo
    public List<Negociacao> getNegocioByIdVeiculo(Long idVeiculo){
        return this.negociacaosRepository.obtenerPorIdVeiculo(idVeiculo);
    }


}
