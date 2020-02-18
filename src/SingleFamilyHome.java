/**
 * SingleFamilyHome is a subclass of Residential represents a building where one family lives. It indicates
 * if there is a garage or not. 
 * @author Matthew Golden
 * @version 1.0
 * Programming project 2 - Construction_MDG
 * Spring/2020
 */
public class SingleFamilyHome extends Residential {

	private boolean garage; //Indicates if there is a garage or not
	
	/**
	 *  Empty-argument constructor to initialize instance variables to base values
	 */
	public SingleFamilyHome()
	{
		super();
		garage = false;
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
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}//end preferred constructor
	
	/**
	 * Eventually will be used to draw the object to the screen.
	 * Until then it will just print to the console.
	 */
	public void draw()
	{
		System.out.println("Drawing code for <<SingleFamilyHome>>");
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
		if(garage == true)
			Z = 'Y';
		else
			Z = 'N';
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: "
		+ occupancyGroup + "\nOccupancy Subgroup: " + subGroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms 
		+ "\nLaundry Room: " + P + "\nGarage: " + Z;
	}//end displayData

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
	
	
	
}//end class
