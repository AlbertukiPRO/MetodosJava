package com.uatx;

import java.util.Scanner;

public class Calculadora {

    public double Sumar(double n1, double n2){
        return n1+n2;
    }

    public double Resta(double n1, double n2){
        return n1-n2;
    }

    public double Divicion(double n1, double n2){
        return n1/n2;
    }

    public double Multiplicacion(double n1, double n2){
        return n1*n2;
    }

    public static void main(String[] args){
        Calculadora obt = new Calculadora();

        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();

        System.out.println("Suma -> "+obt.Sumar(input1,input2));
        System.out.println("Resta -> "+obt.Resta(input1,input2));
        System.out.println("Multiplicación ->"+obt.Multiplicacion(input1,input2));
        System.out.println("División ->"+obt.Divicion(input1,input2));
    }
}
