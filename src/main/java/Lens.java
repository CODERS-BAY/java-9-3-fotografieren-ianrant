public class Lens {

    private static int NUMBER_OF_LENSES = 0;
    private double minFocalLength;
    private double maxFocalLength;

    public Lens(double minFocalLength, double maxFocalLength) {
        if (minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
            this.maxFocalLength = maxFocalLength;
            NUMBER_OF_LENSES++;
        } else {
            throw new IllegalArgumentException("!!!!!Your lens probably will not work, ztoopit!!!!!");
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
                " and a minimum of " + maxFocalLength + ".\n";
    }
}
