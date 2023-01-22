package Practical_12;
//importing
import java.util.*;

import static java.util.Collections.swap;

public class FootballLeague {
    //setting altributes
    private String Footleague_ID;
     List<Team> teamlist=new LinkedList();
//use to arrange teams in linkedlist()
    public FootballLeague(String Footleague_ID) {
        this.Footleague_ID = Footleague_ID;

    }
    //use for sorting the teams in a football league
    public void sorting(){
        Collections.sort(teamlist, new Comparator<Team>() {
                    @Override
                    public int compare(Team o1, Team o2) {
                        return -(o1.getPoints()-o2.getPoints());
                    }
                });

    }



    //to print the analysis of a team
    public String toString() {
        String output = "";
        output += "practical12.FootballLeague: " + this.Footleague_ID + "\n";
        Integer position = 1;
        for (Team team : this.teamlist) {
            output += "\nRanking " + position.toString() + "\n";
            output += team;
            position += 1;
        }
        return output;
    }
//to add a team in a league
    public void addteam(Team toAdd) {
        this.teamlist.add(toAdd);
    }
//if win need to upgrade the points
    public void winMatch(Team winningTeam, Team losingTeam) {
        for (int i = 0; i < this.teamlist.size(); i++) {
            if (teamlist.get(i).getName().compareTo(winningTeam.getName()) == 0) {
                winningTeam.increaseWin();
            }
            if (this.teamlist.get(i).getName().compareTo(losingTeam.getName()) == 0) {
                losingTeam.increaseLosses();
            }
        }
    }
    //if draw need to upgrade the points
    public void draw(Team one, Team two) {
        for (int i = 0; i < this.teamlist.size(); i++) {
            if (teamlist.get(i).getName().compareTo(one.getName()) == 0) {
                one.increaseDraws();
            }
            if (this.teamlist.get(i).getName().compareTo(two.getName()) == 0) {
                two.increaseDraws();
            }
            //no need for losses because it remains same if the team loss
        }
    }
    //function to remove a team from a league
    public void removeOldTeam(Team t){
        this.teamlist.remove(t);
    }

}
