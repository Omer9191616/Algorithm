package Practical_12;

public class Team implements Comparable<Team> {
//storing data
    private String name;
    private int wins;
    private int draws;

    private Integer losses;
    private  Integer points;
//passing variables
    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.points = 0;
    }
    //to print all the data related to the team

    public String toString(){
        String output = "";
        output += "Team {\n";
        output += "\tName: " + this.name + "\n";
        output += "\tWins: " + this.wins + "\n";
        output += "\tDraw: " + this.draws + "\n";
        output += "\tLoss: " + this.losses + "\n";
        output += "\tPoints: " + this.points + "\n";
        output += "}\n";
        return output;
    }
    //to get the name of the team
    public String getName() {
        return this.name;
    }
    //to get the point of the team

    public int getPoints(int nextToCompare) {
        return points;
    }
    //to upgrade the points

    public void increaseWin(){
        wins+=1;
points+=3;

    }
    //to upgrade the points
    public void increaseLosses(){
        this.losses+=1;


    }
    //to upgrade the points
    public void increaseDraws(){
        draws+=1;
points+=1;

    }

    //for comparing
    @Override
    public int compareTo(Team o) {
        //compared by points
        return -this.points.compareTo(o.points);

    }
//return points
    public int getPoints() {
        return points;
    }
}
