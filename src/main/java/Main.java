public class Main {

    public static void main(String[] args) {

        Camera camera1 = new Camera("Sony", 24, 4.5, true);
        System.out.println(camera1.toStringWithoutLens());

        Lens lens1 = new Lens(1.3, 3.2);

        //System.out.println(camera1.toStringWithoutLens() + "\n" + lens1.toString() + "\n");
        System.out.println(lens1.toString());
        camera1.setLens(lens1);
        System.out.println(camera1.toStringWithLens());


        /*
        Camera camera2 = new Camera("Nikon", 12, 3.5, false);
        Lens lens2 = new Lens(1.6, 2.2);
        System.out.println(camera2.toString() + "\n" + lens2.toString() + "\n");

        Camera camera3 = new Camera("Leika", 30, 5, true);
        Lens lens3 = new Lens(5.0, 4.2);
        System.out.println(camera3.toString() + "\n" + lens3.toString() + "\n");

        lens3.setMinFocalLength(4.2);
        lens3.setMaxFocalLength(5.8);
        System.out.println(camera3.toString() + "\n" + lens3.toString() + "\n");
        */

        Camera camera4 = new Camera("Canon", 48, 4.0, true, 2.1, 4.2);
        System.out.println(camera4.toStringWithLens());
        System.out.println("Changing the lens because I bought a better one. Step 1: Taking old lens of. Step 2: Attach new lens.");
        camera4.setLens(null);
        camera4.setLens(new Lens(1.2, 5.2));
        System.out.println(camera4.toStringWithLens());


    }

}
