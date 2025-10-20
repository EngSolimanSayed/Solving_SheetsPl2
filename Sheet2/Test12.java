//Q8.7
public class Test12 {
    public static double distance(double X1, double Y1, double Z1, double X2, double Y2, double Z2) {
        return Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)) + ((Z2 - Z1) * (Z2 - Z1)));
    }

    public static void main(String[] args) {
       double[][] points = {
            {-1, 0, 3},
            {-1, -1, -1},
            {4, 1, 1},
            {2, 0.5, 9},
            {3.5, 2, -1},
            {3, 1.5, 3},
            {-1.5, 4, 2},
            {5.5, 4, -0.5}
        };
        int p1 = 0, p2 = 1;
        double ShortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1],
                points[p2][2]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double dist = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
                        points[j][2]);
                if (ShortestDistance > dist) {
                    p1 = i;
                    p2 = j;
                    ShortestDistance = dist;
                }
            }

        }
        System.out.println("The closest two points are:");
        System.out.println("(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and ("
                + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
        System.out.printf("Their distance is: %.4f " , ShortestDistance);

    }
}