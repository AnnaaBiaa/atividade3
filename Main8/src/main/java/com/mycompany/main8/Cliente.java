/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main8;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Cliente extends Fisica{
    
    private int protocoloAtedimento;

    public Cliente(int protocoloAtedimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNasc, id, nome, telefone, endereco, email);
        this.protocoloAtedimento = protocoloAtedimento;
    }

    public int getProtocoloAtedimento() {
        return protocoloAtedimento;
    }

    public void setProtocoloAtedimento(int protocoloAtedimento) {
        this.protocoloAtedimento = protocoloAtedimento;
    }

    @Override
    public String toString() {
        return "\ninformações Clientes\n" + super.toString() + "\nprotocoloAtedimento:" + protocoloAtedimento;
    }
  
}
