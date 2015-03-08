import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob05 {
    public static void main(String[] args){
        try {
            File file = new File("prob05.txt");

            Scanner input = new Scanner(file);
            List<Integer> swagger = new ArrayList<Integer>();

            while (input.hasNextLine()) {
                swagger.add(Integer.parseInt(input.nextLine()));
            }
            input.close();

            int a = swagger.get(0);
            int b = swagger.get(1);
            int c = swagger.get(2);

            System.out.println(a + " x (" + b + " + " + c + ") = " + a + " x " + b
                    + " + " + a + " x " + c);
            System.out.println(a + " x " + (b+c) + " = " + a*b + " + " + a*c);
            System.out.println(a*(b+c) + " = " + a*(b+c));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
