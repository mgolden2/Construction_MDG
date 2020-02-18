/**
 * Building is the superclass for all objects in our system. It contains basic instance
 * members to describe a building. It also contains the draw method to draw the object and
 * the displayData method to return all variables within the object 
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 2 - Construction_MDG
 * Spring/2020
 */

public class Building {

	protected String projectName; //Name of building
	protected String completeAddress; //Address of building
	protected double totalSquareFeet; //Total square feet of building
	protected String occupancyGroup; //The group occupying the building
	protected String subGroup; //The sub group that the building is assigned to
	
	/**
	 * Empty-argument constructor to initialize instance variables to base values
	 */
	public Building()
	{
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subGroup = "";
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initialize instance variables
	 * using the passed parameters
	 * @param projectName 
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}//end preferred constructor
	
	/**
	 * Eventually will be used to draw the object to the screen.
	 * Until then it will just print to the console.
	 */
	public void draw()
	{
		System.out.println("Drawing code for <<Building>>");
	}//end draw
	
	/**
	 * Returns a formatted String that contains all the information about the object
	 * @return New Formatted String
	 */
	public String displayData()
	{
		return "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: "
	+ occupancyGroup + "\nOccupancy Subgroup: " + subGroup;
	}//end displayData

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the subGroup
	 */
	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup

	/**
	 * @param subGroup the subGroup to set
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString
	
	
}//end class
