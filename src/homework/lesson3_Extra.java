package homework;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class TravelTimeCalculator
{
	String fromCity;
	String toCity;
	ZoneId zIdFromCity;
	ZoneId zIdToCity;	
	String sFromCityZoneOff;
	String sToCityZoneOff;
	int iDistance;
	int iSpeedPerHour;
	ZonedDateTime departuerDateTime;
	ZonedDateTime landDateTime;
	TravelTimeCalculator(String fromCity,String sFromCityZoneOff,String toCity,String sToCityZoneOff,ZonedDateTime departuerDateTime,int iDistance,int iSpeedPerHour)
	{
		this.fromCity=fromCity;
		this.toCity=toCity;
		this.departuerDateTime=departuerDateTime;
		this.sFromCityZoneOff=sFromCityZoneOff;
		this.sToCityZoneOff=sToCityZoneOff;
		this.iDistance=iDistance;
		this.iSpeedPerHour=iSpeedPerHour;
	}
	
	ZonedDateTime CalculateArraivalTime() 
	{
		LocalDateTime LocaldepartuerDateTime;
		landDateTime= departuerDateTime.plusMinutes(getDuration());
		landDateTime= landDateTime.withZoneSameInstant(ZoneId.of("GMT"+sToCityZoneOff+":00"));
		return landDateTime;
	}
   long getDuration()
	{
		return (long)((double)iDistance/iSpeedPerHour*60);
	}
}
public class lesson3_Extra {
	public static void main(String[] args) {
		String fromCity;
		String toCity;
		ZoneId zIdFromCity;
		ZoneId zIdToCity;	
		String sFromCityZoneOff;
		String sToCityZoneOff;
		int iDistance;
		int iSpeedPerHour;
		
		ZonedDateTime departuerDateTime;
		ZonedDateTime landDateTime;
		LocalDateTime localDepartuerDateTime;
		String DepartureLocalDateTime;
		/*
		fromCity="Chicogo";
		toCity="Detroit";
		sFromCityZoneOff="-06";
		sToCityZoneOff="-05";
		iDistance=500;
		iSpeedPerHour=400;
		DepartureLocalDateTime="2015-11-29 10:12:12";
		*/
		Scanner myScanner=new Scanner(System.in);
		System.out.print("Please input the Departure City (like Chicogo)\n");
		fromCity=myScanner.next();
		myScanner.nextLine();
		System.out.print("Please input the Departure City time off with GMT (for Chicogo like -06):\n");
		sFromCityZoneOff=myScanner.next();
		myScanner.nextLine();
		
		System.out.print("Please input the Departure Date and Time (like 2015-11-29 10:12:12):\n");
		DepartureLocalDateTime=myScanner.nextLine();
		myScanner.nextLine();
		
		System.out.print("Please input the Destination City (like Detriot)\n");
		toCity=myScanner.next();
		myScanner.nextLine();
		
		System.out.println("Please input the Destination City time off with GMT (for Detriot like -05):");
		sToCityZoneOff=myScanner.next();
		
		System.out.println("Please input the Distance between 2 cities (in miles):");
		iDistance=myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("Please input the Airplane speed (in miles/hour):");
		iSpeedPerHour=myScanner.nextInt();
		myScanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm:ss");
		localDepartuerDateTime = LocalDateTime.parse(DepartureLocalDateTime, formatter);
		departuerDateTime=ZonedDateTime.of(localDepartuerDateTime, ZoneId.of("GMT"+sFromCityZoneOff+":00"));
		System.out.println("from "+fromCity+"/Departure Date and Time:"+departuerDateTime.toString());
		
		TravelTimeCalculator myTravelTimeCalculator = new TravelTimeCalculator(fromCity,sFromCityZoneOff,toCity,sToCityZoneOff,departuerDateTime,iDistance,iSpeedPerHour);
		landDateTime=myTravelTimeCalculator.CalculateArraivalTime();
		System.out.println("To "+toCity+"/Land Date and Time:"+landDateTime.toString());
		
	}
}
