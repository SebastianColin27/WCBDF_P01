
package com.upiiz.jscb_P01.Models;



public class Endereco {
    public Long idEndereco;
    public String cep;
    public String rua;
    public String cidade;
    public String uf;
    public Long idCliente;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Endereco() {
    }

    public Endereco(Long idEndereco, String cep, String rua, String cidade, String uf, Long idCliente) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.idCliente = idCliente;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


}
