import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob04 {
    public static void main(String[] args){
        try {
            File file = new File("prob04.txt");

            Scanner input = new Scanner(file);

            List<Integer> swagger = new ArrayList<Integer>();

            while (input.hasNextLine()) {
                int k = Integer.parseInt(input.next());
                int j = Integer.parseInt(input.next());
                if(k == 0 && j == 0)
                    break;
                swagger.add(k * j);
            }
            input.close();

            for(int k = 0; k < swagger.size(); k++)
                System.out.println(swagger.get(k));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
