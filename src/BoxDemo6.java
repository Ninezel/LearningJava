/* Here, Box6 uses a constructor to initialise the
dimensions of a box
 */

class Box6 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box6.
    Box6() {
        System.out.println("Constructing Box6");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        // declare, allocate, and initialise Box6 objects
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // get volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume of Box1: " + vol);

        // get volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume of Box2: " + vol);
    }
}
