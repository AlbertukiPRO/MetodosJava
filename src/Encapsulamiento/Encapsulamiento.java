package Encapsulamiento;

class Foo {
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    Foo(String nombre) {
        this.nombre = nombre;
    }

    public void setName(String nombre){
        this.nombre=nombre;
    }
}

public class Encapsulamiento {

    public static void main(String[] args){
        Foo obt = new Foo("Aarón");
        System.out.println(obt.getNombre());
    }

}


