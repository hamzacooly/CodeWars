import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob07 {
    public static void main(String[] args){
        try {
            File file = new File("prob07.txt");

            Scanner input = new Scanner(file);
            List<Double> swagger = new ArrayList<Double>();
            List<Double> swag = new ArrayList<Double>();

            while (input.hasNextLine()) {
                swagger.add(Double.parseDouble(input.nextLine()));
            }
            input.close();
            double exp = 2.0/3.0;
            for(int k = 0; k < swagger.size() - 1; k++)
                swag.add(Math.pow(swagger.get(k), exp));

            for(int k = 0; k < swagger.size() - 1; k++)
                System.out.println(swag.get(k));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
