package firth_wpgtransit_wrapper;

import org.json.simple.JSONObject;

import java.util.HashMap;

public class Street
{
    private static String ref = "streets";
    private int key;
    private String name;
    private String type;

    public Street(int stKey, String stName, String stType)
    {
        key = stKey;
        name = stName;
        type = stType;
    }

    public static Street createStreetFromJSON(JSONObject info)
    {
        Street toReturn = null;

        int theKey = Integer.parseInt(info.get("key").toString());
        String theName = info.get("name").toString();
        String abbr = info.get("type").toString();

        toReturn = new Street(theKey, theName, abbr);

        return toReturn;
    }
}

class StreetType
{
    public static final HashMap shortToLong;
    public static final HashMap longToShort;

    static
    {
        shortToLong = new HashMap<String, String>();
        shortToLong.put("Ave", "Avenue");
        shortToLong.put("St", "Street");
        shortToLong.put("Blvd", "Boulevard");


        longToShort = new HashMap<String, String>();
        longToShort.put("Avenue", "Ave");
        longToShort.put("Street", "St");
        longToShort.put("Boulevard", "Blvd");
    }
}
