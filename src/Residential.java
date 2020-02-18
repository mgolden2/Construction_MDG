/**
 * Residential is a subclass of Building and represents a building where people can live. It has instance fields
 * that show the number of bedrooms, bathrooms, and if there is a laundry room.
 * Programming project 2 - Construction_MDG
 * Spring/2020
 */
public class Residential extends Building {

	protected int numBedrooms; //Number of bedrooms
	protected int numBathrooms; //Number of bathrooms
	protected boolean laundryRoom; //Indicates if there is a laundry room or not
	
	/**
	 * Empty-argument constructor to initialize instance variables to base values
	 */
	public Residential()
	{
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
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
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor


	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//isLaundryRoom

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}//end toString
	
	
	
	
}//end Residential
