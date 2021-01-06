public class HighestPaidAthletes {

    private static void main(String[] args) {

        AllTimeAthlete athlete1 = new AllTimeAthlete(1, "Michael Jordan", "Basketball", "United States", 1850);
        TwentyTwentyAthlete athlete2 = new TwentyTwentyAthlete(1, "Roger Federer", "Tennis", "Switzerland", 106, 6, 100);

        System.out.println("\"" + athlete1.getName() + "\" is ranked #" + athlete1.getRank() + ". He plays " + athlete1.getSport() + " in " + athlete1.getNation() + " and has earned " + athlete1.getEarnings() + " in Millions.");
        System.out.println("\"" + athlete2.getName() + "\" is ranked #" + athlete2.getRank() + ". He plays " + athlete2.getSport() + " in " + athlete2.getNation() + " and has earned " + athlete2.getEarnings() + " in Millions. He makes " + athlete2.getSalary() + " million for his salary and makes " + athlete2.getEndorsements() + " million in endorsements.");

    }
}