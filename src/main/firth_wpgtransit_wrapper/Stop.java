package main.firth_wpgtransit_wrapper;

import org.json.simple.JSONObject;

public class Stop
{
    private int key;
    private String name;
    private String direction; //to be updated to proper object later
    private Street mainStreet, crossStreet;

    public Stop(int stopnum, String stopName, String dir, Street main, Street cross)
    {
        key = stopnum;
        name = stopName;
        direction = dir;
        mainStreet = main;
        crossStreet = cross;
    }

    public static Stop createStopFromJSON(JSONObject info)
    {
        Stop toReturn = null;

        int theKey = Integer.parseInt(info.get("key").toString());
        String theName = info.get("name").toString();
        String theDir = info.get("direction").toString();
        Street main = Street.createStreetFromJSON((JSONObject)info.get("street"));
        Street cross = Street.createStreetFromJSON((JSONObject)info.get("cross-street"));

        toReturn = new Stop(theKey, theName, theDir, main, cross);

        return toReturn;
    }

    public int getKey()
    {
        return key;
    }

    public String getName(){return name;}
}
