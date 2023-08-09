package com.linuxtips.descomplicandojavaespring.day06.abstracao.interfaces;

public class LinuxTipsBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vinde ao linux tips bank");
        ContaCorrente ccFran = new ContaCorrente();
        ccFran.consultarSaldo();
        ccFran.fazerPix();


        ContaPoupanca cpFran = new ContaPoupanca();
        cpFran.consultarSaldo();
        cpFran.fazerPix();

    }
}
