public class Lens {

    /*

    Außerdem besitzt eine Kamera ein Objektiv Lens welches eine minimale und maximale Brennweite besitzt.

     */

    private static int numberOfLenses = 0;
    private double minFocalLength;
    private double maxFocalLength;

    public Lens(double minFocalLength, double maxFocalLength) {
        if (minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
            this.maxFocalLength = maxFocalLength;
            numberOfLenses++;
        } else {
            System.out.println("!!!!!Your lens probably will not work, ztoopit!!!!!");
        }

    }

    public double getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(double minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public double getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(double maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    @Override
    public String toString() {
        return "The lens has a minimum focal length of " + minFocalLength +
                " and a minimum of " + maxFocalLength;
    }
}
