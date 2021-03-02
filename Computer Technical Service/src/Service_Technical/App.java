package Service_Technical;

import Utils.*;

public class App {
    public static void main(String[] args) {

        //CREAMOS EL CLIENTE

        Client client1 = new Client("Jose Ramon","08012001543","9865-4909","Col. Suazo Cordova");

        //Metodo de SALUDO DEL CLIENTE DEFINIDO EN LA CLASE Client
        System.out.println(client1.Saludar());

        //CREAMOS EL EQUIPO(computadora)

        Computer compu1 = new Computer("Laptop","Dell","Memorias Ram dañadas",548.6);
        Computer compu2 = new Computer("Desktop","HP","Memorias Ram dañadas",458.3);

        client1.Computers.add(compu1);
        client1.Computers.add(compu2);

        System.out.println("Mostrando por ciclo de repeticion(Foreach)");
        for (Computer c: client1.Computers) {
            System.out.println(c.tip_compu);
        }

        //CREAMOS EL TECNICO

        Techincal techincal_admin = new Techincal("Roberto Padilla","9875334243153","2025-5454");

        System.out.println("Accediendo directamente a la lista por get()");
        System.out.println(client1.Computers.get(0).tip_compu);

    }
}