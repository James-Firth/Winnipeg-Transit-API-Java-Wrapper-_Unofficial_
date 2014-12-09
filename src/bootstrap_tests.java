import firth_wpgtransit_wrapper.TransitConnector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import firth_wpgtransit_wrapper.*;
/**
 * Created by James on 12/9/2014.
 */
public class bootstrap_tests
{
    public static void main(String[] args)
    {

        File file = new File("config_files/api_key");
        String api_key = null;

        try {

            Scanner sc = new Scanner(file);

            if(sc.hasNextLine())
            {
                api_key = sc.nextLine();
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        if(api_key != null && !api_key.equals("")) {
            TransitConnector trns = new TransitConnector(api_key);
            Stop aStop = trns.getStopInfo();
            System.out.println("Stop info: "+aStop.getKey()+ " " +aStop.getName());
        }
        else
        {
            System.out.println("Crud.");
        }
    }
}
