package sourceCode;

/*
 * Route Manager
 * Manages all routes
 * Used to add routes, remove routes as well as search for routes
 */
public class RouteManager {
    
    private int id;
    private Route[] routes;
    private int numberOfRoutes;

    public RouteManager(int id){
        this.id = id;
        this.routes = new Route[1];
        this.numberOfRoutes = this.routes.length - 1;
    }

    public boolean addRoute(Route route){

        try{

            if(this.numberOfRoutes == this.routes.length){

                Route[] newRoutes = new Route[this.routes.length * 2];
                
                for(int i = 0; i < this.routes.length; i++){

                    newRoutes[i] = this.routes[i];
                }

                this.routes = newRoutes;

            }

            this.routes[this.numberOfRoutes] = route;
            //System.out.println(route.getId());
            this.numberOfRoutes++;

            return true;
        }
        catch(Exception ex){
            return false;
        }

    }

    public boolean removeRoute(Route route){

        int freeIndex = -1;

        try{

            for(int i = 0; i < this.numberOfRoutes; i++){

                if(this.routes[i].getId() == route.getId()){
                    freeIndex = i;
                    break;
                }
            }

            if(freeIndex == -1) return false;

            for(int a = 0; a < this.numberOfRoutes; a++){
                if(a < freeIndex) continue;
                else{
                    this.routes[a] = this.routes[a + 1];
                }
            }

            return true;
        }
        catch(Exception ex){
            return false;
        }
    }

    public boolean searchRoute(Route route){
        for(int i = 0; i < this.numberOfRoutes; i++){
            if(this.routes[i].getId() == route.getId()){
                return true;
            }
        }

        return false;
    }

    public int getNumberOfRoutes(){
        return this.numberOfRoutes;
    }

    public Route routeWithPoint(Point point){

        numberOfRoutes = 0;

        for(int i = 0; i < this.numberOfRoutes; i++){

            for(int y = 0; y < this.routes[i].getSize(); y++){
                if(point.getLocation() == this.routes[i].getCurrentRoute()[y].getLocation()){
                    return this.routes[i];
                }
            }
        }

        return new Route(-33);
    }

    public Route createRouteFromPoints(Point[] points, int routeID){

        Route newRoute = new Route(routeID);

        for(int i = 0; i < points.length; i++){
            newRoute.addPoint(points[i]);
        }

        return newRoute;

    }
}