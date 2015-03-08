import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob11 {
    public static void main(String[] args){
        try {
            File file = new File("prob11-2-in.txt");

            Scanner input = new Scanner(file);

            List<Integer> intarray = new ArrayList<Integer>();
            for(int k = 1; k <= 50; k++)
                intarray.add(k*2);
            List<Integer> size = new ArrayList<Integer>();
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> col = new ArrayList<Integer>();

            while (input.hasNext()) {
                int a = Integer.parseInt(input.next());
                int b = Integer.parseInt(input.next());
                int c = Integer.parseInt(input.next());
                size.add(a);
                row.add(b);
                col.add(c);
            }
            input.close();

            size.remove(size.size()-1);
            row.remove(row.size()-1);
            col.remove(col.size()-1);

            for(int c = 0; c < size.size(); c++) {
                for (int b = 0; b < row.get(c); b++) {
                        for (int k = 0; k < size.get(c) / 2; k++) {
                            for (int i = 0; i < col.get(c); i++) {
                                for (int j = 0; j < (size.get(c) - intarray.get(k)) / 2; j++)
                                    System.out.print("#");
                                for (int j = 0; j < intarray.get(k) / 2; j++)
                                    System.out.print("/");
                                for (int j = 0; j < intarray.get(k) / 2; j++)
                                    System.out.print("\\");
                                for (int j = 0; j < (size.get(c) - intarray.get(k)) / 2; j++)
                                    System.out.print("#");
                            }
                            System.out.println();
                        }

                        for (int k = (size.get(c) / 2) - 1; k >= 0; k--) {
                            for (int i = 0; i < col.get(c); i++) {
                                for (int j = 0; j < (size.get(c) - intarray.get(k)) / 2; j++)
                                    System.out.print("#");
                                for (int j = 0; j < intarray.get(k) / 2; j++)
                                    System.out.print("\\");
                                for (int j = 0; j < intarray.get(k) / 2; j++)
                                    System.out.print("/");
                                for (int j = 0; j < (size.get(c) - intarray.get(k)) / 2; j++)
                                    System.out.print("#");
                            }
                            System.out.println();
                        }
                }
                System.out.println();
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
