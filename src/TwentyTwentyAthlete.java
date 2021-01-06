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
}
