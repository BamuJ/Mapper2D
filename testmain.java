import sourceCode.Point;
import sourceCode.Route;
import sourceCode.RouteManager;

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
        System.out.println("Location of point: " + location[0] + " " + location[1]);

        //Getting elevation of point
        double elevationOfPoint = point1.getElevation();
        System.out.println("\nElevation Of Point: " + elevationOfPoint);

        //Setting Elevation of point
        point1.setElevation(1.5637);
        double updatedElevation = point1.getElevation();
        System.out.println("\nUpdated Elevation of point: " + updatedElevation);

        // Updating location of point
        point1.setLocation(1.34542381, 5.32569412);
        double[] newLocation = point1.getLocation();
        System.out.println("\nUpdated Location of point: " + newLocation[0] + " " + newLocation[1]);

        //Using the route class
        Route newRoute = new Route(0);
        Route newRoute1 = new Route(2);
        Route newRoute2 = new Route(3);

        Route newRoute3 = new Route(6);

        //Adding points to the route
        newRoute.addPoint(point1);
        newRoute.addPoint(point2);
        newRoute.addPoint(point3);
        newRoute.addPoint(point4);
        newRoute.addPoint(point5);
        newRoute.addPoint(point6);
        newRoute.addPoint(point7);
        newRoute.addPoint(point8);
        newRoute.addPoint(point9);

        newRoute1.addPoint(point4);
        newRoute1.addPoint(point5);
        newRoute1.addPoint(point6);

        newRoute2.addPoint(point3);
        newRoute2.addPoint(point7);
        newRoute2.addPoint(point10);

        //Checking all the points on the route
        Point[] pointsOnRoute = newRoute.getCurrentRoute();

        System.out.println("\nPoints on Route: ");
        for(int i = 0; i < newRoute.getSize(); i++)
        {
            System.out.println("\t" + pointsOnRoute[i].toString());
        }

        //Getting the starting point
        Point startPoint = newRoute.getStartPoint();
        System.out.println("\nStarting point: " + startPoint.getLatitude() + " " + startPoint.getLongitude());

        //Getting the ending point
        Point endPoint = newRoute.getEndPoint();
        System.out.println("\nEnding point: " + endPoint.getLatitude() + " " + endPoint.getLongitude());

        //Creating a route manager
        RouteManager routeManager = new RouteManager(10);
        routeManager.addRoute(newRoute);
        routeManager.addRoute(newRoute1);
        routeManager.addRoute(newRoute2);

        //Searching For newRoute2
        if(routeManager.searchRoute(newRoute3))
        {
            System.out.println("\nThe Route exists in the manager class");
        }else{
            System.out.println("\nThe Route doesn't exists in the manager class");
        }




    }
}
