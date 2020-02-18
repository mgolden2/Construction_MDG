/**
 * Mall represents a mall is a subclass of Business that creates more specific instance variables and overrides methods
 * draw and displayData from the Building super class.
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 2 - Construction_MDG
 * Spring/2020
 */
public class Mall extends Business {

	private int numRentedUnits; //Number of rented units
	private double medianUnitSize; //The median size of the units
	private int numParkingSpaces; //Number of parking spaces
	
	/**
	 * Empty-argument constructor to initialize instance variables to a base value.
	 */
	public Mall()
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	
	}//end empty-argument constructor

	/**
	 * Preferred constructor to initialize instance variables
	 * using the passed parameters
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numRentableUnits
	 * @param numRentedUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentableUnits, 
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor
	
	/**
	 * Eventually will be used to draw the object to the screen.
	 * Until then it will just print to the console.
	 */
	public void draw()
	{
		System.out.println("Drawing code for <<Mall>>");
	}//end draw

	/**
	 * Returns a formatted String that contains all the information about the object
	 * @return New Formatted String
	 */
	public String displayData()
	{
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: "
	+ occupancyGroup + "\nOccupancy Subgroup: " + subGroup + "\nRentable Units: " + numRentableUnits + "\nRented Units: " + numRentedUnits + 
	"\nMedian Unit Size: " + medianUnitSize + "\nParking Spaces: " + numParkingSpaces;
	}//end displayData

	

	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString
	
	
	
	
	
}//end Mall
