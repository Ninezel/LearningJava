// Here, Box7 uses a parameterised constructor to initialise the dimensions of the box

class Box7 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box7
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate and initialise Box7 objects
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // get volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume of Box1: " + vol);

        // get volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume of Box2: " + vol);
    }
}
