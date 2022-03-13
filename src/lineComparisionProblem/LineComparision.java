package lineComparisionProblem;

public class LineComparision {
    double Distance(int x1, int y1, int x2, int y2) {
        double distance;
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }

    public static void main(String[] args) {
        LineComparision linecomparision = new LineComparision();
         Double firstLine = linecomparision.Distance(2, 3, 4, 5);
         Double secondLine = linecomparision.Distance(1, 2, 1, 3);

        if (Double.compare(firstLine, secondLine) == 0)
            System.out.println("Both the lines are Equal");
        else if (Double.compare(firstLine, secondLine) < 0)
            System.out.println("secondLine is greater than firstLine");
        else
            System.out.println("firstLine is Greater than secondLine");
    }
}