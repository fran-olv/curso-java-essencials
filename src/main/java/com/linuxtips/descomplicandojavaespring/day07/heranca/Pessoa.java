package com.linuxtips.descomplicandojavaespring.day07.heranca;

public class Pessoa {

    public static void main(String[] args) {

        PessoaDesenvolderaBackend pessoaDesenvolderaBackend = new PessoaDesenvolderaBackend("franbackend", "java e spring", 10000.0);
        pessoaDesenvolderaBackend.codar();



        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd =  new PessoaDesenvolvedoraFrontEnd("franfrontend", "javaescripto", 10000.0);
        pessoaDesenvolvedoraFrontEnd.codar();


    }
}
