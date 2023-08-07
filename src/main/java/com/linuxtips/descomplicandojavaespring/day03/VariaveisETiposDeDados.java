package com.linuxtips.descomplicandojavaespring.day03;

public class VariaveisETiposDeDados {

    public static void main(String[] args) {

		// Byte valores inteiros ou negativos, requer 8 bits,
		// maximo 127 minimo -128 (valores fora precisa colocar em int)
		byte meuByte = 127;
		System.out.println("meu byte" + meuByte);

		// Short suporta o dobro de bits do byte = 16bits
		// min -32678 e max 32767
		short meuShort = 32767;
		System.out.println("meu Short" + meuShort);

		// 32 bits de memoria (mais custoso)
		// min 2147483648 e max 2147483647
		int idade = 15;
		System.out.println("idade" + idade);

		//64 bits
		long meuLong = 10L;
		System.out.println("meu long" + meuLong);


		//64 bits e 2 casas deciamais de precisao ocupa + memoria
		double salario = 102.51;
		System.out.println("meu double" + salario);

		// 32 bits, precisao simples
		float salarioFloat = 102.51F;
		System.out.println("meu float" + salarioFloat);

		//String pacote java lang objetive e não é uma estrutura de dado primitiva
		//String cadeia de caractere
		// char 1 caracter , 16 caractere, um unicode
		char letra ='A';
		System.out.println("meu char" + letra);

		//verdade ou mentira
		//1 bit
		boolean javaELegal = true;
		System.out.println("meu boolean" + javaELegal);

		//uso: int > double >= long

    }

}
