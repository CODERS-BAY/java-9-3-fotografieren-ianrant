public class Main {

    public static void main(String[] args) {

        Camera camera1 = new Camera("Sony", 24, 4.5, true);
        Lens lens1 = new Lens(1.3, 3.2);
        System.out.println(camera1.toString() + "\n" + lens1.toString() + "\n");

        Camera camera2 = new Camera("Nikon", 12, 3.5, false);
        Lens lens2 = new Lens(1.6, 2.2);
        System.out.println(camera2.toString() + "\n" + lens2.toString() + "\n");

        Camera camera3 = new Camera("Leika", 30, 5, true);
        Lens lens3 = new Lens(5.0, 4.2);
        System.out.println(camera3.toString() + "\n" + lens3.toString() + "\n");

        lens3.setMinFocalLength(4.2);
        lens3.setMaxFocalLength(5.8);
        System.out.println(camera3.toString() + "\n" + lens3.toString() + "\n");


    }

}
