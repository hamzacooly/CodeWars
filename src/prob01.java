import java.io.File;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob01 {
    public static void main(String[] args){
        try {
            File file = new File("prob01.txt");

            Scanner input = new Scanner(file);
            String name = null;

            while (input.hasNextLine()) {
                name = input.nextLine();
            }
            input.close();
            System.out.println("Greetings, Honorable " + name + " the Great! We humbly welcome your royal presence.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
