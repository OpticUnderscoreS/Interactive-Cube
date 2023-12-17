package cube.cubeStuff;

public class Point {
    float x, y, z;

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(float[] coords, float multiplier) {
        this.x = coords[0] * multiplier;
        this.y = coords[1] * multiplier;
        this.z = coords[2] * multiplier;
    }

    public String toString() {
        String temp = "Point: ";
        temp += x + ", " + y + ", " + z;
        return temp;
    }
}
