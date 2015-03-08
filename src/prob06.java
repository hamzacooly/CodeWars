import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob06 {
    public static void main(String[] args){
        try {
            File file = new File("prob06.txt");
            Scanner input = new Scanner(file);
            int yards = 0;
            int volume = 0;
            int a=0, b=0, c=0;
            a = Integer.parseInt(input.nextLine());
            b = Integer.parseInt(input.nextLine());
            c = Integer.parseInt(input.nextLine());

            volume = a*b*c;
            yards = (int)Math.ceil((double)(volume/27.0));

            System.out.println(yards);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
