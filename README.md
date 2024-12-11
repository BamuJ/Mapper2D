# 2D Mapper

## Descriptions
This library was mainly intended to help in 3D mapping of buildings and small areas using mainly GPS coordinates and elevations to form routes, points and connections between those points. These can be used to generate 3D maps that offer a way for users to find their way around an office space. With enough data, we could reconstruct a 3D visualization of the building and that can have multiple applications like route planning, in-house guidance systems.

Qn. Tell me a little about your library.

Qn. What features does your library offer?

## Features
1. Point

This feature allows us to accurately capture the latitude and longitude of the GPS coordinates. Down the line, with enough points we can create routes that can be used to direct, guide and help users navigate their way around a space. This feature also includes elevation that allows for more than two dimesional navigation.

2. Route

This feature is used to converge points in to one group that we can call a route. With enough points on a route, we could create a navigation system that points users in the right direction for every possible location query. With even elevation added, we could navigate a 3D space accurately. With even more accuracy, we could even predict distance from start location to destination.

3. ConnectingLine

This feature is mainly used to connect points and offer direction during navigation. Connecting lines could even be used to create a local compass to guide users from current location to the next recorded point location.

4. RouteManager

This feature is used to keep track of routes stored within the program updating it as needed to provide accurate, real-time navigation guide for new and existing users. This can be used to update routes from one area of a space to anaother incase of issues in between those spaces.

## Installation
### Step 1: Downloading the library
```bash
#This line downloads the library in to your working directory
git clone https://github.com/BamuJ/2D_Mapper.git
```

### Step 2: Importing the library and all it's features
```java
//This line imports all our features in to the current file
import 2D_Mapper.sourceCode.*
```

### Step 3: Using the library
```java
//This creates a new point
Point point = new Point();

//This creates a new route
Route route = new Route();

//This create a new connecting line
ConnectingLine connectingLine = new ConnectingLine();

//This create a new route manager
RouteManager routeManager = new RouteManager();
```

## API Documentation
### Point
1. #### getLatitude()
This method takes in no parameters and returns a double representing the latitude.

2. #### getLongitude()
This method takes in no parameters and returns a double representing the longitude.

3. #### getElevation()
This method takes in no parameters and returns a double representing the elevation.

4. #### getLocation()
This method takes in no parameters and returns an array with latitude at index 0 and longitude at index 1.

5. #### setElevation(double elevation)
This method takes in an elevation value and sets elevation of a point.

6. #### setLocation(double latitude, double longitude)
This method takes in the latitude and longitude values respectively and it sets the location of a point.

7. #### toString()
This method returns the string representation of a point instance.

### Route
1. #### increaseRouteArray()
This method takes in no parameter but returns a boolean indicating whether the route array size has increased.

2. #### isRouteArrayComplete()
This method takes in no parameter and returns a boolean indicating whether the array is full.

3. #### addPoint(Point point)
This method takes in a point instance and adds that point to the route array.

4. #### getStartPoint()
This method takes in no parameters and returns a point that is the first point added to the route.

5. #### getEndPoint()
This method takes in no parameters and returns a point that is the last point added to the route.
6. #### getId()
This method takes in no parameters and returns of the Id of a route.

7. #### getCurrentRoute()
This method takes in no parameters and returns the list of points that make up the route.

8. #### getSize()
This method takes in no parameters and returns the number of points associated with that route.

9. #### increaseConnectingLinesArray()
This method takes in no parameters and returns a boolean indicating whether the connecting lines array has been increased.

### Connecting Line
1. #### getEndingPoint()
This method takes in no parameters and returns the end point of the connecting line.

2. #### getStartingPoint()
This method takes in no parameters and returns the starting point of the connecting line.

### Route Manager
1. #### addRoute(Route route)
This method takes in a route instance as parameter and returns a boolean indicating it's success status.

2. #### removeRoute(Route route)
This method takes in a route instance and returns a boolean indicating it's success status.

3. #### searchRoute(Route route)
This method takes in a route instance and returns a boolean indicating it's success status.

4. #### getNumberOfRoutes()
This method takes in no parameters and returns the number of routes stored in a manager instance.

5. #### routeWithPoint(Point point)
This method takes in a point instance and returns a route with that particular point.

6. #### createRouteFromPoints(Point[] points, int routeID)
This method takes in an array of points and an Id and returns the route created from those points and Id.

## Authors
Bamukunda Joanitah bamukundajoanitah@gmail.com

## Licence
Released under MIT License

Copyright (c) 2024 Bamukunda Joanitah.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.