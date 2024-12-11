package sourceCode;

public class ConnectingLine {

    private Point startingPoint;
    private Point endingPoint;

    public ConnectingLine(Point startingPoint, Point endPoint){
        this.startingPoint = startingPoint;
        this.endingPoint = endPoint;
    }

    public Point getEndingPoint(){
        return this.endingPoint;
    }

    public Point getStartingPoint(){
        return this.startingPoint;
    }
    
}