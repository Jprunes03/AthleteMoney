public class TwentyTwentyAthlete extends Athlete {
    //Fields
    private int Salary;
    private int Endorsements;

    public TwentyTwentyAthlete(int rank, String name, String sport, String nation, int earnings, int salary, int endorsements) {
        super(rank, name, sport, nation, earnings);
        this.Salary = salary;
        this.Endorsements = endorsements;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getEndorsements() {
        return Endorsements;
    }

    public void setEndorsements(int endorsements) {
        Endorsements = endorsements;
    }
    public String toString() {
        String description = "\"" + this.getName();
        description += "\" is ranked #" + this.getRank();
        description += ". He plays " + this.getSport();
        description += " in " + this.getNation();
        description += " and has earned " + this.getEarnings();
        description += " in Millions. He makes " + this.getSalary();
        description += " million for his salary and makes " + this.getEndorsements();
        description += " million in endorsements.";
    }


}
