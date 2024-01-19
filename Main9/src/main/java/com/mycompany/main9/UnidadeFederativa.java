/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main9;

/**
 *
 * @author Ana Beatriz
 */
public enum UnidadeFederativa {
    
    BAHIA ("Bahia","BA"),
    SAO_PAULO ("Sao Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ"),
    MARANHÃO("Maranhão","MA"),
    SERGIPE("Sergipe","SE"),
    ALAGOAS("Alagoas","AL"),
    PARAIBA("Paraiba","PB"),
    CEARA("Ceara","CE"),
    MINAS_GERAIS("Minas Gerais","MG"),
    ESPIRITO_SANTO("Espirito Santo","ES"),
    MATO_GROSSO("Mato Grosso","MT"),
    MATO_GROSSO_SUL("Mato Grosso do Sul","MS"),
    PARANA("Parana","PR"),
    AMAZONAS("Amazonas","AM"),
    ACRE("Acre","AC"),
    AMAPA("Amapa","AP"),
    GOIAS("Goias","GO"),
    RIO_GRANDE_NORTE("Rio Grande do Norte","RN"),
    PIAUI("Piaui","PI"),
    PERNAMBUCO("Pernambuco","PE"),
    RIO_GRANDE_SUL("Rio Grande do Sul","RS"),
    TOCANTINS("Tocantins","TO"),
    SANTA_CATARINA("Santa Catarina","SC"),
    PARA("Pará","PA"),
    RONDONIA("Rondonia","RO"),
    RORAIMA("Roraima","RR"),
    DISTRITO_FEDERAL("Distrito Federal","Distrito Federal");
    
    
    private String texto;
    private String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }

   
}
