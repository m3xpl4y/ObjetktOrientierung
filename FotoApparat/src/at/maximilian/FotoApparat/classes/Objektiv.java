package at.maximilian.FotoApparat.classes;

public class Objektiv extends FotoAparat{
    private int minFocalLength;
    private int maxFocalLength;
    private String ObjBrand;

    //CONSTRUCTOR
    public Objektiv() {
    }

    public Objektiv(int minFocalLength, int maxFocalLength, String brand) {
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        this.brand = brand;
    }
    //FUNKTIONEN
    public String getFocalLength(){
        return getMinFocalLength() + " bis " + getMaxFocalLength();
    }

    //GETTER & SETTER
    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    public String getObjBrand() {
        return ObjBrand;
    }

    public void setObjBrand(String objBrand) {
        ObjBrand = objBrand;
    }
}
