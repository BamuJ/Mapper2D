package sourceCode;

public class Point{

    private double longitude;
    private double latitude;
    private double elevation;

    public Point(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLocation(double longitude, double latitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double[] getLocation(){
        double[] location = {this.latitude, this.longitude};
        return location;
    }

    public double getElevation(){
        return this.elevation;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public void setElevation(double elevation){
        this.elevation = elevation;
    }

    public String toString()
    {

        String data = "Point: {";

        data += "lon: " + this.longitude + ", ";
        data += "lat: " + this.latitude + ", ";
        data += "elv: " + this.elevation + " "; 
        data += "}\n";

        return data;
    }

}