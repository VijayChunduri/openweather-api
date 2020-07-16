package com.timezone;
import java.util.*;

public  class TimezoneUtilList {

public static String getTimezone(String country, String city)
{
    String timezone = "";
	String[] temp = TimeZone.getAvailableIDs();
    List<String> timezoneList = new ArrayList<String>();
    List<String> simplifiedTimezoneList = new ArrayList<String>();
    for (String tz : temp)
    {
    	
		    
        timezoneList.add(tz);
    }

    for (String tz : timezoneList)
    	 if (tz.startsWith(country)) {  		    
		    	 
            simplifiedTimezoneList.add(tz);
    	 }
    
    for (String tz : simplifiedTimezoneList)
   	 if (tz.contains(city)) {  		    
		    	 
   		timezone=tz;
   	 }
    return timezone;
}
}