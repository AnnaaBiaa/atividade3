/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main9;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main9 {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(45, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.JULY,5 ), "Luisa", "91526283", 
        new Endereco("72", "9", "casa", "417289", "Rio Branco", UnidadeFederativa.ACRE), "Luisa@gmail.com");
        
        Produto produto = new Produto("Feijão", "Alimento", 10.00);
        
        Fornecedor fornecedor = new Fornecedor(Setor.ALIMENTICIO, "3782728", "728261", "67", "Mercado & cia", "6272818", 
        new Endereco("627827", "673", "esmpresa", "72822", "Rio Branco", UnidadeFederativa.ACRE), "mercado@gmail.com");
        
        PrestacaoServico prestacao = new PrestacaoServico(LocalDate.of(2020, Month.JANUARY, 12), LocalDate.of(2023, Month.OCTOBER, 5), "637282", "67", "Beleza", "71239403", 
        new Endereco("628172", "621", "empresa", "72891", "Salvador", UnidadeFederativa.BAHIA), "beleza@gmail.com");
        
        System.out.println(cliente.toString());
        System.out.println(produto.toString());
        System.out.println(fornecedor.toString());
        System.out.println(prestacao.toString());
        
        
    }
 }
