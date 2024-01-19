/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main9;

/**
 *
 * @author Ana Beatriz
 */
public class Fornecedor extends Juridica{
    
    private Setor setor;
    private Produto produto;

    public Fornecedor(Setor setor, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco, String mercadogmailcom) {
        super(cnpj, inscricaoEstadual, nome, telefone, endereco, email);
        this.setor = setor;
        this.produto = produto;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecedor\n" + super.toString() + "\nsetor:" + setor.getNome() + "\nproduto:" + produto;
    }

    
   
    
    
}
