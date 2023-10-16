
/**
 * This class contains instances of coordinates in the polar format.
 * This class is based on the implementation of PointCP from the text book:
 * "Object Oriented Software Engineering" and is issued under the open-source
 */
public class PointCart extends PointCP
{

	

	//Constructors ******************************************************
	
	/**
	* Constructs a coordinate object, with a type identifier.
	*/
	public PointCart(double x, double y)
	{
		  super(x,y);
	}
		
	
	//Instance methods **************************************************
	
	public double getX(){
		// Add your code here...
		
		return xOrRho; // this line should be replaced when you add your code
	}
	
	public double getY(){
		// Add your code here...
		
		return yOrTheta; // this line should be replaced when you add your code
	}
	
	public double getRho(){
		// Add your code here...
		
		return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2))); // this line should be replaced when you add your code
	
	}
	
	public double getTheta(){
		// Add your code here...
		
		return Math.toDegrees(Math.atan2(yOrTheta, xOrRho)); // this line should be replaced when you add your code
	}
		
	@Override
	public PointCP convertStorageToPolar() {
		
		// Add your code here...
		
		return new PointCart(getRho(), getTheta()); // this line should be replaced when you add your code
	}
	
	
	@Override
	public PointCP convertStorageToCartesian() {
		
		// Add your code here...
		
		return this; // this line should be replaced when you add your code
	}


	
	
	/**
	* Returns information about the coordinates.
	*
	* @return A String containing information about the coordinates.
	*/
	public String toString(){
		return "Stored as Cartesian (" + getX() + "," + getY() + ")\n";
	}
}
