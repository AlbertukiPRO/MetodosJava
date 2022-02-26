package constructores;

import java.util.Scanner;

public class Carro {

    int modelo;
    String color;
    String marca;
    double precio;
    boolean venta  = false;

    Carro(int setmodelo, String setcolor, String setmarca, double setPrecio){
        this.modelo=setmodelo;
        this.marca=setmarca;
        this.color=setcolor;
        this.precio=setPrecio;
    }

    public void VenderAuto(){
        venta = true;
        System.out.println("Gracias por tu compra, pague.");
    }

}


class Cliente {
    public static void main(String[] args) {
        Carro obt = new Carro(2010,"negro","Nissan",128000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio del auto $"+obt.precio);
        boolean isCompra = scanner.nextBoolean();
        if (isCompra){
            obt.VenderAuto();
        }else{
            System.out.println("Adios");
        }
    }
}