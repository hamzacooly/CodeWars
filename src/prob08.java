import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 */
public class prob08 {
    public static void main(String[] args){
        try {
            File file = new File("prob08-1-in.txt");
            Scanner input = new Scanner(file);
            int empty=0;
            int dup=0;
            int noCube=0;
            int length = Integer.parseInt(input.nextLine());
            List <String> name = new ArrayList<String>();
            List<Integer> box = new ArrayList <Integer> ();
            for(int i=0; i<length; i++) {
                name.add(input.next());
                box.add(Integer.parseInt(input.next()));
                if (name.get(i).equals("NA")) {
                    empty++;
                }
                if (box.get(i) == 0)
                {
                    noCube++;
                }
            }

            for(int i=0; i<box.size()-1; i++)
            {
                for(int k=i+1; k<box.size();k++)
                {
                    if((int) box.get(i)== box.get(k)&& box.get(k)!=0) {
                        dup++;
                        k--;

                        for (int j = i + 1; j < box.size(); j++) {
                            if ((int) box.get(j) == box.get(i) || box.get(j)==0) {
                                box.remove(j);
                                j--;
                            }
                        }
                    }
                }
            }
            System.out.println("Empty Cubes: " + empty);
            System.out.println("Duplicate Cube Assignments: " + dup);
            System.out.println("Employees without Cube: " + noCube);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
