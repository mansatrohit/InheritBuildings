
public class ResidentialBuild extends Buildings{
	int NoOfBlocks;
	String Type;
	void attributes() {
		switch (Type) {
		case "IndependentHouse" : 
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
		    break;
		case "Apartment" :    
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
			break;
		case "Villa" : 
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
		    break;
		 default :
			System.out.println("Enter The Valid Type Of Building 1.IndependentHouse 2.Apartment 3.Villa");		}
  	}
}
