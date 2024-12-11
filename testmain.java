import sourceCode.Point;

public class testmain 
{

    public static void main(String[] args)
    {

        //Sequence of points that behave as if they have come from the a GPS monitor
        //Here we are only considering longitude and latitude
        Point point1 = new Point(1.34542345, 5.32569384);
        Point point2 = new Point(1.34542346, 5.32569385);
        Point point3 = new Point(1.34542347, 5.32569385);
        Point point4 = new Point(1.34542348, 5.32569386);
        Point point5 = new Point(1.34542349, 5.32569386);
        Point point6 = new Point(1.34542350, 5.32569386);
        Point point7 = new Point(1.34542352, 5.32569387);
        Point point8 = new Point(1.34542354, 5.32569387);
        Point point9 = new Point(1.34542356, 5.32569389);
        Point point10 = new Point(1.34542360, 5.32569393);

        //Operations on points
        //Getting latitude and longitude of point
        double[] location = point1.getLocation();
        System.out.println(location[0] + " " + location[1]);


    }
}
