package main;

import spacecraft_child.SaturnoV;
import spacecraft_father.Shuttle;

public class Fly {

    public static void main(String[] args) throws InterruptedException {

        SaturnoV saturnoV = new SaturnoV();
        saturnoV.launch();



    }
}
