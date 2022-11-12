import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
    
public class Time   
{      
	static DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("h a ");
	//Local time instance
	static OffsetTime pickupTime0 = OffsetTime.now().plusMinutes(0);
	static OffsetTime pickupTime1 = OffsetTime.now().plusMinutes(60);
	static OffsetTime pickupTime2 = OffsetTime.now().plusMinutes(120);
	static OffsetTime pickupTime3 = OffsetTime.now().plusMinutes(180);
	static OffsetTime pickupTime4 = OffsetTime.now().plusMinutes(240);
	static OffsetTime pickupTime5 = OffsetTime.now().plusMinutes(300);
	static OffsetTime pickupTime6 = OffsetTime.now().plusMinutes(360);
	static OffsetTime pickupTime7 = OffsetTime.now().plusMinutes(420);
	static OffsetTime pickupTime8 = OffsetTime.now().plusMinutes(480);
	static OffsetTime pickupTime9 = OffsetTime.now().plusMinutes(540);
	static OffsetTime pickupTime10 = OffsetTime.now().plusMinutes(600);
	static OffsetTime pickupTime11 = OffsetTime.now().plusMinutes(660);
	static OffsetTime pickupTime12 = OffsetTime.now().plusMinutes(720);
	static OffsetTime pickupTime13 = OffsetTime.now().plusMinutes(780);
	static OffsetTime pickupTime14 = OffsetTime.now().plusMinutes(840); 
	static String localTimeString0 = FOMATTER.format(pickupTime0);
	static String localTimeString1 = FOMATTER.format(pickupTime1);
	static String localTimeString2 = FOMATTER.format(pickupTime2);
	static String localTimeString3 = FOMATTER.format(pickupTime3);
	static String localTimeString4 = FOMATTER.format(pickupTime4);
	static String localTimeString5 = FOMATTER.format(pickupTime5);
	static String localTimeString6 = FOMATTER.format(pickupTime6);
	static String localTimeString7 = FOMATTER.format(pickupTime7);
	static String localTimeString8 = FOMATTER.format(pickupTime8);
	static String localTimeString9 = FOMATTER.format(pickupTime9);
	static String localTimeString10 = FOMATTER.format(pickupTime10);
	static String localTimeString11 = FOMATTER.format(pickupTime11);
	static String localTimeString12 = FOMATTER.format(pickupTime12);
	static String localTimeString13 = FOMATTER.format(pickupTime13);
	static String localTimeString14 = FOMATTER.format(pickupTime14);
}