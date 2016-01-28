
public class CommercialBuild extends Buildings{
	int NoOfBlocks;
	String Type;
	void attributes() {
		switch (Type) {
		case "Hotel" : 
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
		    break;
		case "Complex" :    
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
			break;
		case "Supermarket" : 
			System.out.println("Name Of The Building:" +BuildingName);
			System.out.println("Total Square Feet:" +Sqft);
			System.out.println("Type Of Residential Building:" +Type);
			System.out.println("Total Rooms:" +NoOfBlocks);
		    break;
		 default :
			 System.out.println("Enter The Valid Type From The List 1.Hotel 2.Complex 3.Supermarket");
		}
  	}
}

