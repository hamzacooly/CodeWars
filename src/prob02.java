import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob02 {
    public static void main(String[] args){
        try {

            File file = new File("prob02.txt");

            Scanner input = new Scanner(file);
            List<String> swagger = new ArrayList<String>();
            int Pe = 1;

            while (input.hasNextLine()) {
                swagger.add(input.nextLine());
            }
            input.close();
            for(int k = 0; k < swagger.size(); k++)
                Pe *= Integer.parseInt(swagger.get(k));
            System.out.println(Pe);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
