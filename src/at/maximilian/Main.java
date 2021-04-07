package at.maximilian;

import at.maximilian.classes.FotoApparat;

public class Main {

    public static void main(String[] args) {
        FotoApparat NikonD610 = new FotoApparat("Nikon", 24, "Japan", 6400, 8, 135);
        NikonD610.selbstauslöser();
    }
}
