package Escuela;

import java.util.Scanner;

abstract class Persona {

    String Nombre, CURP, Fecha;

    abstract void Matricula();
}

class Alumno extends Persona {

    private String Matricula;

    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    Alumno(String a, String b, String c){
        Nombre = a;
        CURP = b;
        Fecha = c;
    }

    @Override
    public void Matricula(){
        setMatricula( ""+CURP.charAt(0)+""+CURP.charAt(1) + Fecha.charAt(0)+Fecha.charAt(1) );
    }

    public void print(){
        Matricula();

        System.out.println("Su matricula es: "+getMatricula());
    }


}

public class Principal {
    public static void main(String[] args) {
        boolean bandera = true;
        int opt = 0;
        Scanner scanner = new Scanner(System.in);


        String a;
        String b;
        String c;


        while (bandera) {
            System.out.println("1-> Registrar alumno");
            System.out.println("2-> Mostrar datos");
            System.out.println("3-> Salir");

            opt = scanner.nextInt();

            switch(opt){
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Nombre: ");
                    a = input.nextLine();
                    System.out.print("CURP: ");
                    b = input.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    c = input.nextLine();
                    Alumno nuevo = new Alumno(a,b,c);
                    nuevo.print();
                    break;
                case 3:
                    bandera = false;
                    break;
            }
        }
    }
}