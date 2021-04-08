package at.maximilian.FotoApparat;

import at.maximilian.FotoApparat.classes.FotoAparat;

public class Main {

    public static void main(String[] args) {
        String CameraName = "Nikon";
        FotoAparat nikon = new FotoAparat(CameraName, "Japan", 24.7,6400,3.2,135);
        nikon.setType("D610");
        nikon.setOwner("Maximilian");
        nikon.selfTimer();
        nikon.productSheet();
        nikon.machFoto();
    }
}
