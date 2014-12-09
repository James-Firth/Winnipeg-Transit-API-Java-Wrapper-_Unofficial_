package firth_wpgtransit_wrapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
//            while (sc.hasNextLine()) {
//                int i = sc.nextInt();
//                System.out.println(i);
//            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        if(api_key != null && api_key != "") {
            TransitConnector trns = new TransitConnector(api_key);
            trns.getStopInfo();
        }
        else
        {
            System.out.println("Crud.");
        }
    }
}
