package com.linuxtips.descomplicandojavaespring.day06;

public class Estudante {

    private String nome;
    private String stack;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }


    public String estudar(){
        return "estou estudando na linux tips agora";
    }

    //para aparecer no console trocar String por void e return por sysout
    //public void estudar(){
    //    System.out.println("estou estudando na linux tips agora"); 
    //}

    public void dormir(){
    }
}
