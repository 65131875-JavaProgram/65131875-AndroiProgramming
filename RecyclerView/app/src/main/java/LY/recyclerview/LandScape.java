package LY.recyclerview;

public class LandScape {
    private String imageFileName;
    private String caption;

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LandScape(String imageFileName, String caption) {
        this.imageFileName = imageFileName;
        this.caption = caption;
    }
}
