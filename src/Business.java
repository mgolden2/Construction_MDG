/**
 * The Business class is a subclass of Builiding and represents a building that will be occupied by some
 * kind of business".
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 2 - Construction_MDG
 * Spring/2020
 */
public class Business extends Building {

	protected int numRentableUnits; //Number of rentable units
	
	/**
	 * Empty-argument constructor to initialize instance variables to a base value
	 */
	public Business() 
	{
		super();
		numRentableUnits = 0;
		
	}//end empty-argument constructor

	/**
	 * Preferred constructor to initialize instance variables
	 * using the passed parameters
	 * @param numRentableUnits
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentableUnits) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor

	

	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
	
	
	
	

}//end Business
