import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hamza on 3/7/2015.
 * */

 public class prob09 {
    public static void main(String[] args){
        try {
            File file = new File("prob09-1-in.txt");

            Scanner input = new Scanner(file);
            List<Team> squad = new ArrayList<Team>();

            while (input.hasNext()) {
                int jaja = input.nextInt();
                int tempint = input.nextInt();
                Team temp = new Team(jaja, tempint);
                squad.add(temp);
            }
            input.close();

            squad.remove(squad.size()-1);

            for (int i = 0; i < squad.size(); i++)
                for(int k = squad.size()-1; k > i; k--)
                    if(squad.get(i).getName() == squad.get(k).getName()){
                        squad.get(i).addToScore(squad.get(k).getScore());
                        squad.remove(k);
                    }


            for (int i = 0; i < squad.size(); i++)
                for(int k = squad.size()-1; k > i; k--)
                    if(squad.get(i).getScore() < squad.get(k).getScore()){
                        Team temp = new Team(squad.get(k).getName(), squad.get(k).getScore());

                        squad.get(k).setName(squad.get(i).getName());
                        squad.get(k).setScore(squad.get(i).getScore());

                        squad.get(i).setName(temp.getName());
                        squad.get(i).setScore(temp.getScore());


                    }

            for(int x = 0; x < 5; x++)
                System.out.println(squad.get(x).getName() + " " + squad.get(x).getScore());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
class Team{
    private int name;
    private int score;

    public Team (){
        name = 0;
        score = 0;
    }
    public Team (int n, int s){
        name = n;
        score = s;
    }
    public int getScore(){
        return score;
    }
    public int getName(){
        return name;
    }
    public void addToScore(int k){
        score +=k;
    }
    public void setScore(int k){
        score = k;
    }
    public void setName(int n){
        name = n;
    }
}



