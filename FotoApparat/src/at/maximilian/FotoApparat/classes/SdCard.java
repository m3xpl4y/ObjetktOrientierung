package at.maximilian.FotoApparat.classes;

public class SdCard extends FotoAparat{

    int sdSize = 0;
    int picSize = 0;
    String SdBrand = "";

    //Constructor
    public SdCard() {
    }

    public int getSdSize() {
        return sdSize;
    }

    public void setSdSize(int sdSize) {
        this.sdSize = sdSize;
    }

    public int getPicSize() {
        return picSize;
    }

    public void setPicSize(int picSize) {
        this.picSize = picSize;
    }

    public String getSdBrand() {
        return SdBrand;
    }

    public void setSdBrand(String sdBrand) {
        SdBrand = sdBrand;
    }
}
