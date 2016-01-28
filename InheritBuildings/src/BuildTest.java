import java.util.Scanner;
public class BuildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		CommercialBuild c = new CommercialBuild();
		System.out.println("Enter The Name Of Building:");
		String Name = s.next();
		System.out.println("Enter The Total Square Feet:");
        int sq = s.nextInt();
        System.out.println("Enter The Type Of Building:");
        String TName = s.next();
        System.out.println("Enter The No Of Blocks:");
        int n = s.nextInt();
        c.BuildingName = Name;
        c.Sqft = sq;
        c.Type = TName;
        c.NoOfBlocks = n;
        c.attributes();
        ResidentialBuild r = new ResidentialBuild();
        System.out.println("Enter The Name Of Building:");
		String Name1 = s.next();
		System.out.println("Enter The Total Square Feet:");
        int sq1 = s.nextInt();
        System.out.println("Enter The Type Of Building:");
        String TName1 = s.next();
        System.out.println("Enter The No Of Blocks:");
        int n1 = s.nextInt();
        r.BuildingName = Name1;
        r.Sqft = sq1;
        r.Type = TName1;
        r.NoOfBlocks = n1;
        r.attributes();
      }
}
	