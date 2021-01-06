public class HighestPaidAthletes {

    public static void main(String[] args) {

        AllTimeAthlete athlete1 = new AllTimeAthlete(1, "Michael Jordan", "Basketball", "United States", 1850);
        TwentyTwentyAthlete athlete2 = new TwentyTwentyAthlete(1, "Roger Federer", "Tennis", "Switzerland", 106, 6, 100);

        System.out.println("\"" + athlete1.Name + "\" is ranked #" + athlete1.Rank + ". He plays " + athlete1.Sport + " in " + athlete1.Nation + " and has earned " + athlete1.Earnings + " in Millions.");
        System.out.println("\"" + athlete2.Name + "\" is ranked #" + athlete2.Rank + ". He plays " + athlete2.Sport + " in " + athlete2.Nation + " and has earned " + athlete2.Earnings + " in Millions. He makes " + athlete2.Salary + " million for his salary and makes " + athlete2.Endorsements + " million in endorsements.");

    }
}