package at.maximilian;

import at.maximilian.classes.FotoApparat;

public class Main {

    public static void main(String[] args) {
        FotoApparat nikon = new FotoApparat("Nikon", 24.7, "Japan", 6400, 3.2, 135);
        nikon.setType("D610");
        nikon.setOwner("Maximilian");
        nikon.selfTimer();
        nikon.productSheet();
        nikon.machFoto();
    }
}
