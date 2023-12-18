package cube.cubeStuff;

public class Point {
    public double x, y, z;

    final public static int X_INDEX = 0;
    final public static int Y_INDEX = 1;
    final public static int Z_INDEX = 2;

    // INSTANCE METHODS

    public void rotate(int a, int b, double angle, double radius) {
        double curAngle = Math.atan2(getAxis(a), getAxis(b));
        curAngle += angle;

        setAxis(a, Math.sin(curAngle) * radius);
        setAxis(b, Math.cos(curAngle) * radius);
        

    }

    public double getAxis(int index) throws IllegalArgumentException {
        switch (index) {
            case X_INDEX:
                return x;
            case Y_INDEX:
                return y;
            case Z_INDEX:
                return z;
            default:
                throw new IllegalArgumentException("Index: " + index);
        }
    }

    public void setAxis(int index, double value) throws IllegalArgumentException {
        switch (index) {
            case X_INDEX:
                x = value;
                break;
            case Y_INDEX:
                y = value;
                break;
            case Z_INDEX:
                z = value;
                break;
            default:
                throw new IllegalArgumentException("" + index);
        }
    }
    
    // CONSTRUCTION METHODS

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(double[] coords, double multiplier) {
        this.x = coords[0] * multiplier;
        this.y = coords[1] * multiplier;
        this.z = coords[2] * multiplier;
    }

    // TESTING METHODS

    public String toString() {
        String temp = "Point: ";
        temp += x + ", " + y + ", " + z;
        return temp;
    }
}
