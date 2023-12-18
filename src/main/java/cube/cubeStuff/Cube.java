package cube.cubeStuff;

public class Cube {

    // CONSTANTS

    final public static int ROTATE_X = 0;
    final public static int ROTATE_Y = 1;
    final public static int ROTATE_Z = 2;

    // INSTANCE VARIABLES

    private float size;
    private Point[] points;
    private double radius;

    // INSTANCE METHODS

    public void rotate(int axis, float angle) throws IllegalArgumentException {
        int horizontalAxis;
        int verticalAxis;

        switch (axis) {
            case ROTATE_X:
                horizontalAxis = ROTATE_Z;
                verticalAxis = ROTATE_Y;
                break;
            case ROTATE_Y:
                horizontalAxis = ROTATE_Z;
                verticalAxis = ROTATE_X;
                break;
            case ROTATE_Z:
                horizontalAxis = ROTATE_X;
                verticalAxis = ROTATE_Y;
                break;
            default:
                throw new IllegalArgumentException();
            
        }

        for (Point p : points) {
            p.rotate(verticalAxis, horizontalAxis, angle, radius);
        }
    }


    // CONSTRUCTION METHODS

    public Point getPoint(int index) {
        return points[index];
    }

    public Cube(float size) {
        this.size = size;

        generateCube();
    }

    private void generateCube() {
        double halfSize =  size/2;
        points = new Point[8];

        radius = Math.sqrt(2 * halfSize*halfSize);
        System.out.println("Size: " + size);
        System.out.println("Size: " + halfSize);
        System.out.println("Size: " + radius);

        double[] coords;

        String binaryCounter;
        char[] binaryArr;

        for (int i = 0; i < 8; i++) {

            binaryCounter = String.format("%3s", Integer.toBinaryString(i)).replaceAll(" ", "0");
            System.out.println(binaryCounter);
            binaryArr = binaryCounter.toCharArray();
            
            coords = binaryArrToCoords(binaryArr);

            points[i] = new Point(coords, halfSize);
        }
    }

    private static double[] binaryArrToCoords(char[] binaryArr) {
        double[] temp = new double[3];

        for (int j = 0; j < 3; j++) {
            temp[j] = (binaryArr[j] == '0') ? 1:-1;
        }

        return temp;
    }

    // TESTING METHODS
    
    public String toString() {
        String temp = "";

        for (int i = 0; i < 8; i++) {
            temp += "[" + i + ". " + points[i].toString() + "] ";
        }

        return temp;
    }

}
