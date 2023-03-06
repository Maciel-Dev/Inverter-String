import java.util.ArrayList;

public class StringInverter {


    static String inverter(String str)
    {
        String finalString = "";
        char charact;
        for(int i = 0; i < str.length(); i++)
        {
            charact = str.charAt(i);
            finalString = charact + finalString;
        }
        return finalString;
    }
}
