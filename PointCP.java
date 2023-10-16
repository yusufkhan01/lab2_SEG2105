
/**
 * 
 * This class represents the abstract idea of a point. It will be specialized using PointCP2 and PointCP3
 * which represent polar and cartesian points respectively.
 * 
 *
 */

public abstract class PointCP{
	  /**
	   * Contains the current value of X or RHO 
	   */
	  protected double xOrRho;
	  
	  /**
	   * Contains the current value of Y or THETA 
	   */
	  protected double yOrTheta;
	  
	  /**
	   * Constructs a coordinate object
	   */
	  public PointCP(double xOrRho, double yOrTheta)
	  {

	    this.xOrRho = xOrRho;
	    this.yOrTheta = yOrTheta;

	  }

	public abstract double getX();
	public abstract double getY();
	public abstract double getRho();
	public abstract double getTheta();
	public abstract PointCP convertStorageToCartesian();
	public abstract PointCP convertStorageToPolar();
	public abstract String toString();
	
	/**
	* Calculates the distance in between two points using the Pythagorean
	* theorem  (C ^ 2 = A ^ 2 + B ^ 2). 
	*
	* @param pointA The first point.
	* @param pointB The second point.
	* @return The distance between the two points.
	*/
	public double getDistance(PointCP pointB) {
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();
		
		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	* Rotates the specified point by the specified number of degrees.
	* Not required until E2.30
	*
	* @param point The point to rotate
	* @param rotation The number of degrees to rotate the point.
	* @return The rotated image of the original point.
	*/
	public PointCart rotatePoint(double rotation) {
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();
			
		return new PointCart(
		(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
		(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}
	
}