package Utils;

import Utils.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public String name_client;
    public String id_client;
    public String phone_client;
    public String direction;

    public List<Computer> Computers;
    public Client(String name, String id, String phone, String dir){
        this.name_client = name;
        this.id_client = id;
        this.phone_client= phone;
        this.direction = dir;
        this.Computers = new ArrayList<Computer>();
    }

    public String Saludar(){
        String Saludo="Hola mi nombre es "+this.name_client+"Y mi ID es "+this.id_client;
        return Saludo;
    }

}
