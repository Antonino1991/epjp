package ex;

public class S53 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
    	
    	double speed = 0;
    	if (time==0) {
    		return Double.POSITIVE_INFINITY;
    	}
    		else {
    			speed = distance/time;
    
    		
    	return speed;
    		}
    	}
    	
    		
    	
    	
        
    

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
        
        return Math.sqrt(Math.pow(x1-x0, 2)+Math.pow(y1-y0, 2));
    }
    /**
     * Engine capacity
     * 
     * @param bore in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
        
        
        return (Math.pow(bore/2, 2) * Math.PI* stroke*nr)/1000;
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        
        return 0;
    }
}
