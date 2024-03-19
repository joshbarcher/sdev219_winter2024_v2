package points;

public class GeneratePoints
{
    public static void main(String[] args)
    {
        double[] xCoords = {6.2, 3.12, 9.86, 5.43, 6.1};
        double[] yCoords = {0.3, -2.7, 4.44, 6.12, 9.9};

        Point[] points = new Point[25];
        int indexCounter = 0;

        //loop over all of our x-coordinates
        for (int i = 0; i < xCoords.length; i++)
        {
            double x = xCoords[i];

            //and match them up with all y-coordinates
            for (int j = 0; j < yCoords.length; j++)
            {
                double y = yCoords[j];

                Point point = new Point(x, y);
                System.out.println(point);

                points[indexCounter] = point;
                indexCounter++; //move to the next index
            }
        }

        for (int i = 0; i < points.length; i++)
        {
            System.out.print(points[i] + ", ");
        }
    }
}
