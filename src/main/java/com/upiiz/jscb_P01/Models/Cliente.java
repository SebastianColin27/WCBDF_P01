package com.upiiz.jscb_P01.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Cliente {

    public Long idCliente;
    public String name;
    public String cpf;
    public String cnh;
    public String email;
    public String telefone;
    public Long idEndereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "idEndereco")
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long idCliente, String name, String cpf, String cnh, String email, String telefone, Long idEndereco, Endereco endereco) {
        this.idCliente = idCliente;
        this.name = name;
        this.cpf = cpf;
        this.cnh = cnh;
        this.email = email;
        this.telefone = telefone;
        this.idEndereco = idEndereco;
        this.endereco = endereco;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }
}



