//Karli Pensabene
//Lab 02 
//Cyclometer java program

//  define a class
public class Cyclometer {
    
    //  add a main method
    public static void main (String[] args) {
    
    //our input data
    
    int secsTrip1=480; //time for trip 1
    int secsTrip2=3220; //time for trip 2
    int countsTrip1=1561; //count for trip 1
    int countsTrip2=9037; //count for trip 2
    
    double wheelDiameter=27.0, //variable for wheel diameter
    PI=3.14159, //pi is used to calculate distance eventually
    feetPerMile=5280, //useful conversion to know for calculations 
    inchesPerFoot=12, //useful conversion to use in calculations
    secondsPerMinute=60; //tells the computer how many seconds are in a minute
    double distanceTrip1, distanceTrip2,totalDistance; //calculating distances of each trip
    
    //print numbers stored in variables for counts and time
    
    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip1+" counts");
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+"minutes and had "+countsTrip2+" counts");
    
    
    //run the calculations; store teh values
    //calculate distance for trip 1, 2 and total
    
    distanceTrip1=countsTrip1*wheelDiameter*PI; //gives distance in inches
    
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //print distances
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }
}
