/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main8;

/**
 *
 * @author Ana Beatriz
 */
public enum UnidadeFederativa {
    
    BAHIA ("BA"),
    SAO_PAULO ("SP"),
    RIO_DE_JANEIRO("RJ"),
    MARANHÃO("MA"),
    SERGIPE("SE"),
    ALAGOAS("AL"),
    PARAIBA("PB"),
    CEARA("CE"),
    MINAS_GERAIS("MG"),
    ESPIRITO_SANTO("ES"),
    MATO_GROSSO("MT"),
    MATO_GROSSO_SUL("MS"),
    PARANA("PR"),
    AMAZONAS("AM"),
    ACRE("AC"),
    AMAPA("AP"),
    GOIAS("GO"),
    RIO_GRANDE_NORTE("RN"),
    PIAUI("PI"),
    PERNAMBUCO("PE"),
    RIO_GRANDE_SUL("RS"),
    TOCANTINS("TO"),
    SANTA_CATARINA("SC"),
    PARA("PA"),
    RONDONIA("RO"),
    RORAIMA("RR"),
    DISTRITO_FEDERAL("Distrito Federal");
    
    
    
    private String sigla;

    private UnidadeFederativa(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    
}
