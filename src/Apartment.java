/**
 * Apartment is a subclass of Residential and represents a building where more than one family can live.
 * It shows the number of rentable units, the average size of apartment, and indicates if there is parking.
 * @author Matthew Golden
 * @version 1.0
 * Programming project 2 - Construction_MDG
 * Spring/2020"
 */
public class Apartment extends Residential {

	private int numRentableUnits; //Number of rentable units
	private double avgUnitSize; //Average unit size of apartment
	private boolean parkingAvailable; //Indicates if there is parking
	
	/**
	 * Empty-argument constructor to initialize instance variables to base values
	 */
	public Apartment()
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end empty-argument constructor

	/**
	 * Preferred constructor to initialize instance variables
	 * using the passed parameters
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor
	
	/**
	 * Eventually will be used to draw the object to the screen.
	 * Until then it will just print to the console.
	 */
	public void draw()
	{
		System.out.println("Drawing code for <<Apartment>>");
	}//end draw
	
	/**
	 * Returns a formatted String that contains all the information about the object
	 * @return New Formatted String
	 */
	public String displayData()
	{
		char P;
		char Z;
		if(laundryRoom == true)
			P = 'Y';
		else
			P = 'N';
		if(parkingAvailable == true)
			Z = 'Y';
		else
			Z = 'N';
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: "
		+ occupancyGroup + "\nOccupancy Subgroup: " + subGroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms 
		+ "\nLaundry Room: " + P + "\nRentable Units: " + numRentableUnits + "\nAverage Unit Size: " + avgUnitSize + "\nAvailable Parking: " + Z;
	}//end displayData

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

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString

}//end Apartment
