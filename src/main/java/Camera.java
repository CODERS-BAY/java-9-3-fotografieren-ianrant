public class Camera {

    private static int NUMBER_OF_CAMERAS = 0;
    private String cameraBrand;
    private double cameraMegapixels;
    private double cameraDisplaySize;
    private boolean colored;
    private String cameraColor = colored ? "colored" : "black/white";
    private Lens lens;

    // Constructor for Camera WITHOUT a boxed lens
    public Camera(String cameraBrand, double cameraMegapixels, double cameraDisplaySize, boolean colored) {
        this.cameraBrand = cameraBrand;
        this.cameraMegapixels = cameraMegapixels;
        this.cameraDisplaySize = cameraDisplaySize;
        this.colored = colored;
        NUMBER_OF_CAMERAS++;
    }

    // Constructor for Camera WITH a boxed lens
    public Camera(String cameraBrand, double cameraMegapixels, double cameraDisplaySize, boolean colored, double minLength, double maxLength) {
        this.cameraBrand = cameraBrand;
        this.cameraMegapixels = cameraMegapixels;
        this.cameraDisplaySize = cameraDisplaySize;
        this.colored = colored;
        NUMBER_OF_CAMERAS++;
        this.lens = new Lens(minLength, maxLength);
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public String getCameraBrand() {
        return cameraBrand;
    }

    public void setCameraBrand(String cameraBrand) {
        this.cameraBrand = cameraBrand;
    }

    public double getCameraMegapixels() {
        return cameraMegapixels;
    }

    public void setCameraMegapixels(double cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    public double getCameraDisplaySize() {
        return cameraDisplaySize;
    }

    public void setCameraDisplaySize(double cameraDisplaySize) {
        this.cameraDisplaySize = cameraDisplaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "cameraBrand='" + cameraBrand + '\'' +
                ", cameraMegapixels=" + cameraMegapixels +
                ", cameraDisplaySize=" + cameraDisplaySize +
                ", colored=" + colored +
                ", cameraColor='" + cameraColor + '\'' +
                ", lens=" + lens +
                '}';
    }

    public String toStringWithoutLens() {
        return "The camera is a " + cameraBrand +
                "\n,has a resolution of " + cameraMegapixels +
                " megapixels,\nits display is " + cameraDisplaySize +
                " inches in diagonale \nand makes " + cameraColor + " images.\n";
    }

    public String toStringWithLens() {
        return "The camera is a " + cameraBrand +
                ",\nhas a resolution of " + cameraMegapixels +
                " megapixels, \nits display is " + cameraDisplaySize +
                " inches in diagonale \nand makes " + cameraColor +
                " images. \nIts lens has a minimal focal length of " + lens.getMinFocalLength() + "\nand a maximum of " + lens.getMaxFocalLength() + ".\n";
    }
}
