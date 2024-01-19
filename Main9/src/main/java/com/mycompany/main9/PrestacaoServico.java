/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main9;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class PrestacaoServico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, Endereco endereco, String email) {
        super(cnpj, inscricaoEstadual, nome, telefone, endereco, email);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "\nPrestacaoServico\n" + super.toString() +  "\ncontratoInicio:" 
                + contratoInicio + "\ncontratoFim:" + contratoFim;
    }
   
}
