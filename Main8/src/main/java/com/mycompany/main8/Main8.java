/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main8;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main8 {

    public static void main(String[] args) {
    Cliente cliente = new Cliente(45, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MARCH, 14), 895, "Laura", "4715865", "laura@gmail.com",
            new Endereco("648382", "12", "casa", "23225740", "Rio Branco", UnidadeFederativa.ACRE));

    Medico medico = new Medico("940", "8948292", "849320", "839299", Setor.SAUDE, 3.500, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1995, Month.MARCH, 4), 34, "Joana", "7194653219", "Joana@gmail.com",
            new Endereco("898289", "14", "casa", "673892", "São Paulo", UnidadeFederativa.SAO_PAULO));

    Engenheiro engenheiro = new Engenheiro("728719", "7281982", "82981", "8291", Setor.ENGENHARIA, 0, Genero.FEMININO, EstadoCivil.SEPARADO, LocalDate.of(1994, Month.MAY, 7), 35, "Luna", "7163695841", "Luna@gmail.com",
            new Endereco("821801", "89", "casa", "627123", "Salvador", UnidadeFederativa.BAHIA));

    Advogado advogado = new Advogado("345", "5437837", "829287", "892762", Setor.JURIDICO, 2.567, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1997, Month.OCTOBER, 6), 85, "Luis", "7287181", "Luis@gmail.com",
            new Endereco("738272", "67", "casa", "32425", "Aracaju", UnidadeFederativa.SERGIPE));

    PrestacaoServicos prestacao = new PrestacaoServicos(LocalDate.of(2020, Month.DECEMBER, 8), LocalDate.of(2022, Month.JULY, 15), "45678", "23975", 8, "Educação", "7191479245", "educacao@gmail.com",
            new Endereco("6276738", "54", "empresarial", "52622627", "Palmas", UnidadeFederativa.TOCANTINS));

    Fornecedor fornecedor = new Fornecedor("creme Hidratante", "52617618", "72811", 84, "Produtos & cia", "584233", "Produtos@gmail.com",
            new Endereco("82791", "231", "empresarial", "6277238", "Belo Horizonte", UnidadeFederativa.MINAS_GERAIS));
    
    
    
    
        System.out.println(cliente.toString());
        System.out.println(medico.toString());
        System.out.println(engenheiro.toString());
        System.out.println(advogado.toString());
        System.out.println(prestacao.toString());
        System.out.println(fornecedor.toString());
        
}
}