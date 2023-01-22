package Practical_12;

public class Dashboard {
//adding teams
        public static void main(String[] args) {
            Team t1=new Team("Milan");
            Team t2= new Team("Juventus");
            Team t3= new Team("Atalanta");

            Team t4=new Team("Koko");
            Team t5= new Team("MAma");
            Team t6= new Team("A7a");

            Team one=new Team("aaaa");
            Team two= new Team("sssss");
            Team three= new Team("dddddd");
            //creating a football league
            FootballLeague fl= new FootballLeague("Serie A");
            //adding teams to the league
            fl.addteam(t1);
            fl.addteam(t2);
            fl.addteam(t3);
            fl.addteam(t4);
            fl.addteam(t5);
            fl.addteam(t6);
            //adding wins,losses and draws
            fl.winMatch(t2,t1);
            fl.winMatch(t2,t4);
            fl.winMatch(t4,t5);
            fl.draw(t1,t5);
            fl.sorting();
//printing all teams in a league
            System.out.println(fl);
        }
    }

