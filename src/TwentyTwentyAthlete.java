public class TwentyTwentyAthlete extends Athlete {
    //Fields
    int Salary;
    int Endorsements;

    public TwentyTwentyAthlete(int rank, String name, String sport, String nation, int earnings, int salary, int endorsements) {
        super(rank, name, sport, nation, earnings);
        this.Salary = salary;
        this.Endorsements = endorsements;
    }
}
