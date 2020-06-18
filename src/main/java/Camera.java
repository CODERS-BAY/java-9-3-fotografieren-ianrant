public class Camera {

    private static int numberOfCameras = 0;
    private String cameraBrand;
    private double cameraMegapixels;
    private double cameraDisplaySize;
    private boolean colored;
    private String cameraColor = colored ? "colored" : "black/white";

    public Camera(String cameraBrand, double cameraMegapixels, double cameraDisplaySize, boolean colored) {
        this.cameraBrand = cameraBrand;
        this.cameraMegapixels = cameraMegapixels;
        this.cameraDisplaySize = cameraDisplaySize;
        this.colored = colored;
        numberOfCameras++;
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
        return "The camera is a " + cameraBrand +
                ", has a resolution of " + cameraMegapixels +
                " megapixels, its display is " + cameraDisplaySize +
                " inches in diagonale and makes " + cameraColor + " images";
    }
}
