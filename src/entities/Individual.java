package entities;

public class Individual extends Taxpayer{


    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double calculateTax() {
        double percentage;
        if (getAnnualIncome() < 20000) {
            percentage = 0.15;
        } else {
            percentage = 0.25;
        }
        return (getAnnualIncome() * percentage) - (this.healthExpenditures * 0.5);
    }
}
