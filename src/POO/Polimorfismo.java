package POO;

abstract class Auto {
    abstract public void Arranca();
}

public class Polimorfismo {
    public static void main(String[] args){
        AutoClasico auto1 = new AutoClasico();
        AutoElectrico auto2 = new AutoElectrico();
        auto1.Arranca();
        auto2.Arranca();
    }
}


class AutoClasico extends Auto {
    @Override
    public void Arranca(){
        System.out.println("Motor de gasolina");
    }
}

class AutoElectrico extends Auto {
    @Override
    public void Arranca(){
        System.out.println("Motor electrico");
    }
}

