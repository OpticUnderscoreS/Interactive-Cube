package cube.cubeStuff;

public class Cube {
    private int size;
    private Point[] points;

    public Cube(int size) {
        this.size = size;

        generateCube();
    }

    private void generateCube() {
        float halfSize = ((float) size)/2;
        points = new Point[8];

        float[] coords;

        String binaryCounter;
        char[] binaryArr;

        for (int i = 0; i < 8; i++) {

            binaryCounter = String.format("%-3s", Integer.toBinaryString(i)).replaceAll(" ", "0");
            binaryArr = binaryCounter.toCharArray();
            
            coords = binaryArrToCoords(binaryArr);

            points[i] = new Point(coords, halfSize);
        }
    }

    private static float[] binaryArrToCoords(char[] binaryArr) {
        float[] temp = new float[3];

        for (int j = 0; j < 3; j++) {
            temp[j] = (binaryArr[j] == '0') ? 1:-1;
        }

        return temp;
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < 8; i++) {
            temp += "[" + i + ". " + points[i].toString() + "] ";
        }

        return temp;
    }

}
