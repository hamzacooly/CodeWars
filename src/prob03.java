import java.io.File;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob03 {
    public static void main(String[] args){
        try {
            File file = new File("prob03.txt");

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                int k = Integer.parseInt(input.nextLine());
                switch (k) {
                    case 1:
                        System.out.println("Number one is alive!");
                        break;
                    case 2:
                        System.out.println("Number two is alive!");
                        break;
                    case 3:
                        System.out.println("Number three is alive!");
                        break;
                    case 4:
                        System.out.println("Number four is alive!");
                        break;
                    case 5:
                        System.out.println("Number five is alive!");
                        break;
                    case 6:
                        System.out.println("Number six is alive!");
                        break;
                    case 7:
                        System.out.println("Number seven is alive!");
                        break;
                    case 8:
                        System.out.println("Number eight is alive!");
                        break;
                    case 9:
                        System.out.println("Number nine is alive!");
                        break;
                    case 10:
                        System.out.println("Number ten is alive!");
                        break;
                }
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
