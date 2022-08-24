/*
    Interfaces: São conheciddas como contratos
 */

public class Interfaces {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println(vent.MARCA);
        vent.desligar();
        vent.ligar();
        vent.desligar();
    }

}
