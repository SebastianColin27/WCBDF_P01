
package com.upiiz.jscb_P01.Models;


public class Veiculo {

    public Long idVeiculo;
    public String placa;
    public String marca;
    public String modelo;
    public String ano;
    public String km;
    public String renam;
    public Long idCliente;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }



    public Veiculo() {
    }

    public Veiculo(Long idVeiculo, String placa, String marca, String modelo, String ano, String km, String renam, Long idCliente) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.renam = renam;
        this.idCliente = idCliente;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getRenam() {
        return renam;
    }

    public void setRenam(String renam) {
        this.renam = renam;
    }


}
