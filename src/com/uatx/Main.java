package com.uatx;

public class Main {

    //TODO: Crear metodo

    public void MetodoVacio(){
        System.out.println("Hola club");
    }

    public void MetodoString(String nombre){
        System.out.println("Hola "+nombre);
    }

    public void DrawLine(String titulo){
        System.out.println("------------"+titulo+"-----------------");
    }

    public Integer Sumar(Integer n1, Integer n2){
        return n1+n2;
    }

    public void MetodoConClase(Test obt){
        System.out.println(obt.x);
    }

    public static void MetodoStatico(){
        System.out.println("Soy el metodo static");
    }


    public static void main(String[] args) {
        Main obt = new Main(); //Creamos el objeto de la clase Main
        obt.DrawLine("Metodo vació");
        obt.MetodoVacio();

        obt.DrawLine("Metodo con String");
        obt.MetodoString("Irving");

        obt.DrawLine("Metodo con return tipo Integer");
        System.out.println(obt.Sumar(45,23));

        Test obtTest = new Test(15);
        obt.DrawLine("Metodo con objetos de clase");
        obt.MetodoConClase(obtTest);

        obt.DrawLine("Metodo Static");
        Main.MetodoStatico();
    }
}

class Test {
    int x;
    Test(int x){
        this.x = x;
    }
}
