package at.maximilian.FotoApparat;

import classes.FotoAparat;

public class Main {

    public static void main(String[] args) {
        FotoAparat nikon = new FotoAparat("Nikon", "Japan", 24.7,6400,3.2,135);
        nikon.setType("D610");
        nikon.setOwner("Maximilian");
        nikon.selfTimer();
        nikon.productSheet();
        nikon.machFoto();
    }
}
