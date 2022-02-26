package constructores;

import javax.swing.*;

public class Alumno{
    int C1;
    int C2;
    int C3;

    Alumno (int setC1, int setC2, int setC3){
        this.C1=setC1;
        this.C2=setC2;
        this.C3=setC3;
    }

    public static void main(String args[]) {
        double  promedio;

        int CALF1 = 3;
        int CALF2 = 4;
        float calif3= 5.1f;

        //NombreClase varible = new NombreClase(CALF1, CALF2, (int)calif3);
        Alumno obt = new Alumno(CALF1, CALF2, (int)calif3); //OBJETO.

        promedio = (obt.C1+obt.C2+obt.C3)/3;

        if ( promedio >= 6)
            System.out.println("Usted aprobó");
        else
            System.out.println("Lo vemos en extra");

    }
}