import java.util.ArrayList;

import java.util.ArrayList;

public class Athlete {
    //Fields
    private static ArrayList<Athlete> athletes;
    private int Rank;
    private String Name;
    private String Sport;
    private String Nation;
    private int Earnings;

    public Athlete(int rank, String name, String sport, String nation, int earnings) {
        this.Rank = rank;
        this.Name = name;
        this.Sport = sport;
        this.Nation = nation;
        this.Earnings = earnings;

       if(athletes == null){
          athletes = new ArrayList<Athlete>();
       }
       athletes.add(this);
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSport() {
        return Sport;
    }

    public void setSport(String sport) {
        Sport = sport;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public int getEarnings() {
        return Earnings;
    }

    public void setEarnings(int earnings) {
        Earnings = earnings;
    }

    static void describeAll() {
        athletes.forEach((eachAthlete)-> {
            System.out.println(eachAthlete);
        } );

    }

}
