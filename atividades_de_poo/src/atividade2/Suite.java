package atividade2;

public class Suite implements Accommodation, AdditionalService {
    private static final double DAILY_RATE = 350.0;
    private int people;

    public Suite(int people) {
        this.people = people;
    }

    @Override
    public double calculateDailyRate() {
        return DAILY_RATE;
    }

    @Override
    public double calculateService(int people, int days) {
        double breakfast = 20.0 * people * days;
        double extraCleaning = 30.0 * days;
        return breakfast + extraCleaning;
    }

    @Override
    public void displayDetails(int days) {
        double totalDaily = calculateDailyRate() * days;
        double totalService = calculateService(people, days);
        System.out.println("Type: Suite");
        System.out.println("Daily Rate: $" + DAILY_RATE);
        System.out.println("People: " + people);
        System.out.println("Total Daily Cost: $" + totalDaily);
        System.out.println("Additional Services: $" + totalService);
        System.out.println("Total Cost: $" + (totalDaily + totalService));
        System.out.println();
    }
}
