package com.timezone;
import java.util.*;


public  class timeZoneLister {

public static void main(String[] args)
{
    List<String> simplifiedTimezoneList = getTimezoneIdList();

    for (String tz : simplifiedTimezoneList)
        System.out.println(tz);
}

public static List<String> getTimezoneIdList()
{
    String[] temp = TimeZone.getAvailableIDs();
    List<String> timezoneList = new ArrayList<String>();
    List<String> simplifiedTimezoneList = new ArrayList<String>();
    for (String tz : temp)
    {
        timezoneList.add(tz);
    }

    for (String tz : timezoneList)
            simplifiedTimezoneList.add(tz);
    return simplifiedTimezoneList;
}
}