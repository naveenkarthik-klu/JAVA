import java.io.*; 
class MilestoKm { 
  
    static double kmphTOmph(double kmph) 
    { 
        return 0.6214 * kmph; 
    } 
  
    static double mphTOkmph(double mph) 
    { 
        return mph * 1.60934; 
    } 
    public static void main(String[] args) 
    { 
        double kmph = 150; 
        double mph = 100; 
        System.out.println("speed in miles/hr is " + kmphTOmph(kmph)); 
        System.out.println("speed in km/hr is " + mphTOkmph(mph)); 
    } 
} 
