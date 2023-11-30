package com.example;

public class NumerosReales {
    public static void main(String[] args) {

        int numero = 5;
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par");
                if (numero > 10) {
                    System.out.println("El número es par y mayor que 10");
                } else {
                    System.out.println("El número es par y menor o igual que 10");
                }
            } else {
                System.out.println("El número es impar");
                if (numero < 0) {
                    System.out.println("El número es impar y negativo");
                } else {
                    System.out.println("El número es impar y positivo");
                }
            }
        } else {
            System.out.println("El número es negativo");
        }
        
    }
}