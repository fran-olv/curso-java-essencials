package com.linuxtips.descomplicandojavaespring.day06.encapsulamento;

public class Cachorro {
    
//private acesso dentro da classe
    private Double peso;
    private Integer idade;
    
//public acesso ao projeto todo
    public Double pesopublic;
    public Integer idadePublic;
    
//acesso dentro do pacote ou apenas pelas classes filhas que extendem a classe cachorro
    protected Double pesoProtected;
    protected Integer idadeProtected;


    public String latir() {
        return "AuAU";

    }

    protected String dormir() {
        return "zzzzz";
    }

    private String comer() {
        return "hora da racao";

    }
}
