package lineComparisionProblem;

public class LineComparision {
    double Distance(int x1, int y1, int x2, int y2) {
        double distance;
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    public static void main(String[] args) {
        LineComparision linecomparision = new LineComparision();
        double value = linecomparision.Distance(2, 3, 4, 5);
        System.out.println("The distance between two points is : " +value);
    }
}
