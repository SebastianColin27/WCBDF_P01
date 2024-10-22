

package com.upiiz.jscb_P01.Models;



import java.math.BigDecimal;

public class Negociacao {

    public Long idNegocio;
    public BigDecimal valor_fipe;
    public BigDecimal valor_venda;
    public BigDecimal valor_compra;
    public String descricao;
    public Long idCliente;
    public Long idVeiculo;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }



    public Negociacao() {
    }

    public Negociacao(Long idNegocio, BigDecimal valor_fipe, BigDecimal valor_venda, BigDecimal valor_compra, String descricao, Long idCliente, Long idVeiculo) {
        this.idNegocio = idNegocio;
        this.valor_fipe = valor_fipe;
        this.valor_venda = valor_venda;
        this.valor_compra = valor_compra;
        this.descricao = descricao;
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
    }

    public Long getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Long idNegocio) {
        this.idNegocio = idNegocio;
    }

    public BigDecimal getValor_fipe() {
        return valor_fipe;
    }

    public void setValor_fipe(BigDecimal valor_fipe) {
        this.valor_fipe = valor_fipe;
    }

    public BigDecimal getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(BigDecimal valor_venda) {
        this.valor_venda = valor_venda;
    }

    public BigDecimal getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(BigDecimal valor_compra) {
        this.valor_compra = valor_compra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
