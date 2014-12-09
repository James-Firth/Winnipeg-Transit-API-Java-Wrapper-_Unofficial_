package firth_wpgtransit_wrapper;

import org.json.simple.JSONObject;

/**
 * Created by James on 12/9/2014.
 */
public class Stop
{
    private int key;
    private String name;
    private String direction; //to be updated to proper object later
    public Stop(int stopnum, String stopName, String dir)
    {
        key = stopnum;
        name = stopName;
        direction = dir;
    }

    public static Stop createStopFromJSON(JSONObject info)
    {
        Stop toReturn = null;

        int theKey = Integer.parseInt(info.get("key").toString());
        String theName = info.get("name").toString();
        String theDir = info.get("direction").toString();

        toReturn = new Stop(theKey, theName, theDir);

        return toReturn;
    }

    public int getKey()
    {
        return key;
    }

    public String getName(){return name;}
}
