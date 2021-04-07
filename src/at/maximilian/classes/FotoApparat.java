package at.maximilian.classes;

public class FotoApparat {
    String brand;
    double megaPixel;
    String countryOfOrigin;
    int iso;
    double display;
    public static final int MIN_FOCAL_LENGTH = 10;
    int maxFocalLength;
    String type;
    String owner;
    String productSheet;

    public FotoApparat() {
    }

    public FotoApparat(String marke, double megaPixel, String herkunftsland, int iso, double display, int maxBrennweite) {
        this.brand = marke;
        this.megaPixel = megaPixel;
        this.countryOfOrigin = herkunftsland;
        this.iso = iso;
        this.display = display;
        this.maxFocalLength = maxBrennweite;
    }

    public FotoApparat(String type, String owner) {
        this.type = type;
        this.owner = owner;
    }

    // GETTER & SETTER
    public String getProductSheet() {
        return productSheet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixel() {
        return megaPixel;
    }

    public void setMegaPixel(double megaPixel) {
        if(megaPixel < 1)
        {
            System.out.println("Megapixel Anzahl zu klein!");
        }
        else {
            this.megaPixel = megaPixel;
        }
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public static int getMinFocalLength() {
        return MIN_FOCAL_LENGTH;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }
    public void setMaxFocalLength(int maxFocalLength)
    {
        if(MIN_FOCAL_LENGTH > maxFocalLength)
        {
            System.out.println("Die mindest Brennweite muss größer als die maximal Brennweite sein!");
        }
        else{
            this.maxFocalLength = maxFocalLength;
        }
    }
    //FUNKTIONEN
    public void machFoto()
    {
        System.out.println("KLICK");
    }
    public void selfTimer()
    {
        System.out.println("Bitte Lächeln!");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        machFoto();
    }

}
