package Service_Technical;

import Utils.Techincal;
import Utils.Client;
import Utils.Computers;

public class App {
    public static void main(String[] args) {

        //CREAMOS EL CLIENTE

        Client client1 = new Client();
        client1.name_client = "Jose Ramon";
        client1.id_client = "08012001543";
        client1.phone_client = "9865-4909";
        client1.direction = "Col. Suazo Cordova";

        System.out.println("    LOS DATOS DEL CLIENTE SON   ");
        System.out.println("El nombre del cliente es: " + client1.name_client);
        System.out.println("Su ID: " + client1.id_client);
        System.out.println("# de Telefono: " + client1.phone_client);
        System.out.println("Su direccion: " + client1.direction);

        //CREAMOS EL EQUIPO(computadora)

        Computers compu1 = new Computers();
        compu1.tip_compu = "Laptop";
        compu1.mark = "Dell";
        compu1.Details = "Memorias Ram dañadas";
        compu1.repair_price = 548.6;

        System.out.println("    MAQUINA EN SERVICIO     ");
        System.out.println("Tipo de computadora: " + compu1.tip_compu);
        System.out.println("Marca: " + compu1.mark);
        System.out.println("Motivo de Servicio Tecnico: " + compu1.Details);
        System.out.println("Precio por la reparacion: " + compu1.repair_price);


        //CREAOS EL TECNICO

        Techincal techincal_admin = new Techincal();
        techincal_admin.id_tech="9875334243153";
        techincal_admin.name_tech="Roberto Padilla";
        techincal_admin.phone_tech="2025-5454";

        System.out.println("    ATENDIDO POR EL TECNICO     ");
        System.out.println(techincal_admin.name_tech);
        System.out.println("Numero de telefono en caso de requirir sus servicios nuevamente: ");
        System.out.println(techincal_admin.phone_tech);

    }
}