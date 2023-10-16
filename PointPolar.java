


/**
 * This class contains instances of coordinates in the polar format.
 * This class is based on the implementation of PointCP from the text book:
 * "Object Oriented Software Engineering" and is issued under the open-source
 */
public class PointPolar extends PointCP{


	  //Constructors ******************************************************
	
	  /**
	   * Constructs a coordinate object
	   */
	  public PointPolar(double rho, double theta){
	    
		super(rho, theta);
	  }
	  
		//Instance methods **************************************************
		
		public double getX(){
			// Add your code here...
			
			return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho); // this line should be replaced when you add your code
		}
		
		public double getY(){
			// Add your code here...
			
			return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho); // this line should be replaced when you add your code
		}
		
		public double getRho(){
			// Add your code here...
			
			return xOrRho; // this line should be replaced when you add your code
		
		}
		
		public double getTheta(){
			// Add your code here...
			
			return yOrTheta; // this line should be replaced when you add your code
		}
	  


	@Override
	public PointCP convertStorageToPolar() {
		
		// Add your code here...
		
		return this; // this line should be replaced when you add your code
	}
	
	
	@Override
	public PointCP convertStorageToCartesian() {
		
		// Add your code here...
		return new PointPolar(getX(), getY()); // this line should be replaced when you add your code
	}


	
	/**
	* Returns information about the coordinates.
	*
	* @return A String containing information about the coordinates.
	*/
	@Override 
	public String toString()
	{
	    return "Stored as Polar [" + getRho() + "," + getTheta() + "]\n";
	}
}
