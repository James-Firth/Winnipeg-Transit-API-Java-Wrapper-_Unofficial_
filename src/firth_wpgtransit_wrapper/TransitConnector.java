package firth_wpgtransit_wrapper;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TransitConnector
{
    private final String USER_AGENT = "Mozilla/5.0";
    private String API_KEY = "";

    public TransitConnector(String key)
    {
        API_KEY = key;

    }


    public Stop getStopInfo()
    {
        Stop theStop = null;
        try {
            JSONObject tmp = sendGet("stops/10064.json?");
            if(tmp.containsKey("stop"))
            {
                theStop = Stop.createStopFromJSON((JSONObject)tmp.get("stop"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return theStop;
    }

    // HTTP GET request
    private JSONObject sendGet(String url_suffix) throws Exception {

        String url = "http://api.winnipegtransit.com/"+url_suffix+"api-key="+API_KEY;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        JSONParser parser=new JSONParser();

        return (JSONObject)parser.parse(response.toString());
    }
}
