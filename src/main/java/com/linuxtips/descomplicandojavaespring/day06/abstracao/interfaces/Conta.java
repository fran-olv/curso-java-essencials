package com.linuxtips.descomplicandojavaespring.day06.abstracao.interfaces;

interface  Conta {
    //implementacao via contrato
    //modificadores de acesso: é tudo publico
    //bom pra implementar herança e polimorfismo
    //interfaces + utilizadas que classes abstratas
    
    public void consultarSaldo();
    public  void fazerPix();
}
