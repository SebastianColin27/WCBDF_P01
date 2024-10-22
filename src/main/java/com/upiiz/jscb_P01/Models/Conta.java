
package com.upiiz.jscb_P01.Models;


public class Conta {

    public Long idConta;
    public Long agencia;
    public String banco;
    public Long idCliente;


    public Conta() {
    }

    public Conta(Long idConta, Long agencia, String banco, Long idCliente) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.banco = banco;
        this.idCliente = idCliente;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }



    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}