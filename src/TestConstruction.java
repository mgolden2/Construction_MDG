
public class TestConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\tBuilding Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		Building nunca = new Building();
		System.out.println(nunca.displayData());
		
		Building Building = new Building("Building", "2001 Newburg Rd, Louisville, KY 40205", 10000.00, "Bellarmine", "Academic Building");
		System.out.println("\n" + Building.displayData() + "\n");
		Building.draw();
		System.out.println();
		Building.setProjectName("New Building");
		System.out.println(Building.getProjectName());
		Building.setCompleteAddress("2002 Oldburg rd, pineville, ohio 90902");
		System.out.println(Building.getCompleteAddress());
		Building.setTotalSquareFeet(9032.43242);
		System.out.println(Building.getTotalSquareFeet());
		Building.setOccupancyGroup("Techinal");
		System.out.println(Building.getOccupancyGroup());
		Building.setSubGroup("Athletic Building");
		System.out.println(Building.getSubGroup());
		System.out.println();
		System.out.println(Building.toString());
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("\n\t\tBusiness Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		Business nada = new Business();		
		Business B = new Business("Local Business", "2001 Newburg Rd, Louisville, KY 40205", 43902.8990, "Business", "Group B", 32 );
		B.setNumRentableUnits(56);
		System.out.println("\n\n" + B.getNumRentableUnits());
		System.out.println(B.toString() + "\n\n");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("\n\t\tResidential Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		Residential empty = new Residential();
		Residential R = new Residential("Residential", "2001 Newburg Rd, Louisville, KY 40205", 6700.47, "Residential", "Groups R-1 to R-4", 1, 2, true);
		
		R.setNumBathrooms(5);
		R.setNumBedrooms(6);
		R.setLaundryRoom(false);
		System.out.println("\n\n" + R.getNumBedrooms() + " " + R.getNumBathrooms() + " " + R.isLaundryRoom());
		System.out.println(R.toString() + "\n\n");
		
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("\n\t\tMall Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		Mall no = new Mall();
		System.out.println(no.displayData());
		
		Mall M = new Mall("Middlesboro", "2001 Newburg Rd, Louisville, KY 40205", 42309.43242, "Business", "Group B",
				57, 45, 625.75, 10000);
		System.out.println("\n" + M.displayData() + "\n");
		M.draw();
		M.setNumRentedUnits(15);
		M.setMedianUnitSize(75.34);
		M.setNumParkingSpaces(5000);
		System.out.println("\n" + M.getNumRentedUnits() + " " + M.getMedianUnitSize() + " " + M.getNumParkingSpaces());
		System.out.println(M.toString());
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("\n\t\tApartment Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		Apartment vacant = new Apartment();
		System.out.println(vacant.displayData());
		
		Apartment A = new Apartment("Highrise", "2001 Newburg Rd, Louisville, KY 40205", 7000.565, "Residential", "R-3", 1, 1, false, 15, 150.45, true);
		System.out.println("\n" + A.displayData() + "\n");
		
		A.draw();
		
		A.setNumRentableUnits(25);
		A.setAvgUnitSize(125.65);
		A.setParkingAvailable(false);
		
		System.out.println("\n" + A.getNumRentableUnits() + " " + A.getAvgUnitSize() + " " + A.isParkingAvailable());
	
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		System.out.println("\n\t\tSingleFamilyHome Object Test");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		SingleFamilyHome devoided = new SingleFamilyHome();
		System.out.println(devoided.displayData());
		
		SingleFamilyHome fullHouse = new SingleFamilyHome("Full House", "2001 Newburg Rd, Louisville, KY 40205", 12000.150, "Residential", "R-3", 4, 3, true, true);
		System.out.println("\n" + fullHouse.displayData() + "\n");
		
		fullHouse.draw();
		
		fullHouse.setGarage(false);
		System.out.println(fullHouse.isGarage());
		
		System.out.println(fullHouse.toString());
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		
		
	
	}//end main

}//end class
