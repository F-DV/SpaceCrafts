package main;

import spacecraft_child.SaturnoV;
import spacecraft_child.Voyage1;

/**
 * @author FelipeQG
 * Simulación de vuelo
 */
public class Fly {

    public static void main(String[] args) throws InterruptedException {

        SaturnoV saturnoV = new SaturnoV("Carga");
        saturnoV.launch();
        System.out.println(saturnoV.toString());

        Voyage1 voyage1 = new Voyage1("Cosmos");
        voyage1.launch();
        System.out.println(voyage1.toString());






    }
}
