package sourceCode;

public class Route{

    private Point[] currentRoute;
    private int id;
    private Point startPoint;
    private Point endPoint;
    private int size;
    private ConnectingLine[] connectingLines;
    private int numberOfConnectingLines;

    public Route(int id){
        this.id = id;
        this.currentRoute = new Point[1];
        this.size = 0;
        
        this.connectingLines = new ConnectingLine[1];
        this.numberOfConnectingLines = 0;
    }

    public boolean increaseRouteArray(){

        if(isRouteArrayComplete()){
            Point[] newArray = new Point[this.currentRoute.length * 2];
            
            for(int i = 0; i < this.currentRoute.length; i++){
                newArray[i] = this.currentRoute[i];
            }

            this.currentRoute = newArray;

            return true;
        }
        else return false;
    }

    public boolean isRouteArrayComplete(){
        if(this.size == this.currentRoute.length) return true;
        else return false;
    }

    public boolean addPoint(Point point){

        if(!isRouteArrayComplete()){

                this.currentRoute[this.size] = point;
                this.size++;

                if(this.size == 1){
                    this.startPoint = point;
                    this.endPoint = point;
                }

                else{
                    if(this.numberOfConnectingLines == this.connectingLines.length){
                        increaseConnectingLinesArray();
                            if(this.getSize() > 1){
                                ConnectingLine newConnectingLine = new ConnectingLine(this.currentRoute[getSize() - 1], point);
                                this.connectingLines[this.numberOfConnectingLines] = newConnectingLine;
                                this.numberOfConnectingLines++;
                            } 
                    }

                    else{
                        if(this.getSize() > 1){
                            ConnectingLine newConnectingLine = new ConnectingLine(this.currentRoute[getSize() - 1], point);
                            this.connectingLines[this.numberOfConnectingLines] = newConnectingLine;
                            this.numberOfConnectingLines++;
                        } 
                    }

                    this.endPoint = point;
                

                return true;
            }
        }
        else{
            increaseRouteArray();
        }

        return false;
    }

    public Point getStartPoint(){
        return this.startPoint;
    }

    public Point getEndPoint(){
        return this.endPoint;
    }

    public int getId(){
        return this.id;
    }

    public Point[] getCurrentRoute(){
        return this.currentRoute;
    }

    public int getSize(){
        return this.size;
    }


    public boolean increaseConnectingLinesArray(){

        if(this.connectingLines.length == this.numberOfConnectingLines){
            ConnectingLine[] newArray = new ConnectingLine[this.connectingLines.length * 2];
            
            for(int i = 0; i < this.connectingLines.length; i++){
                newArray[i] = this.connectingLines[i];
            }

            this.connectingLines = newArray;

            return true;
        }
        else return false;
    }
}