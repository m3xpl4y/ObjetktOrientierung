package at.maximilian.FotoApparat.classes;

public class FotoAparat {
    String brand;
    String type;
    String countryOfOrigin;
    double megaPixel;
    int iso;
    double display;
    String owner;
    SdCard sdCard;
    Objektiv objektiv;

    //CONSTRUCTORS
    public FotoAparat() {

    }

    public FotoAparat(String brand, String countryOfOrigin, double megaPixel, int iso, double display) {
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.megaPixel = megaPixel;
        this.iso = iso;
        this.display = display;
    }
    // GETTER & SETTER


    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public SdCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SdCard sdCard) {
        this.sdCard = sdCard;
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

    //FUNKTIONEN
    public void machFoto()
    {
        sdCard.sdSize = sdCard.sdSize - sdCard.getPicSize();
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

    public void productSheet()
    {
        System.out.println("PRODUKTBLATT");
        System.out.println("Marke: " + brand);
        System.out.println("Typ: " + type);
        System.out.println("Herkunftsland: " + countryOfOrigin);
        System.out.println("MegaPixel: " + megaPixel);
        System.out.println("ISO-Anzahl " + iso);
        System.out.println("Display größe: " + display);
        System.out.println("Minimale Brennweite: " + objektiv.getMinFocalLength());
        System.out.println("Maximale Brennweite: " + objektiv.getMaxFocalLength());
        System.out.println("Name des Besitzers: " + owner);
    }

    @Override
    public String toString() {
        return "FotoApparat{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", megaPixel=" + megaPixel +
                ", iso=" + iso +
                ", display=" + display +
                ", maxFocalLength=" + objektiv.getMaxFocalLength() +
                ", owner='" + owner + '\'' +
                '}';
    }
}
