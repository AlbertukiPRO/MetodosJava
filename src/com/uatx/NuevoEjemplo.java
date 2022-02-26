package com.uatx;

public class NuevoEjemplo {
    public static void main(String[] args){
        Metodos obt = new Metodos();
        obt.Saludar("Cristian");

        Metodos.Sumar(12.4f,78.5f);
    }
}


class Metodos {
    public void Saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
    public static void Sumar(float n1, float n2){
        float resultado = n1+n2;
        System.out.println(resultado);
    }
}


