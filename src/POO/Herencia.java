package POO;

abstract class Figura {
    String nombre; //Herencia
    abstract public void area(); //Polimorfismo y Herencia
    abstract public void showData();
}

class Rectangulo extends Figura {

    double base;
    double altura;
    double area = 0;

    Rectangulo(double setbase, double setaltura, String setnombre){
        this.base = setbase;
        this.altura =setaltura;
        this.nombre = setnombre;
    }

    @Override
    public void area() {
        area = base*altura;
    }

    public void showData(){
        area();
        System.out.println("Base -> "+base+"\nAltura -> "+altura+"\nArea -> "+area+"Nombre ->"+nombre);
    }
}

class Tringulo extends Figura {

    double base;
    double altura;
    double area;

    Tringulo(double b, double a){
        base =b;
        this.altura=a;
        if (this.nombre==null)
            this.nombre = "Falta el nombre";
    }

    @Override
    public void area() {
        area = (base*altura)/2;
    }

    public void showData() {
        area();
        System.out.println("Base -> "+base+"\nAltura -> "+altura+"\nArea -> "+area+"Nombre ->"+nombre);
    }
}


public class Herencia {
    public static void main(String[] args){
        Rectangulo rect1 = new Rectangulo(10.0, 8, "Rectangulo");
        Rectangulo rect2 = new Rectangulo(20, 10, "Rectangulo 2");
        Tringulo tria1 = new Tringulo(25, 45);
        rect1.showData();
        rect2.showData();
        System.out.println("----------TRIANGULO---------");
        tria1.showData();
    }
}
