package entities;

public class Company extends Taxpayer{

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax() {
        double percentage;
        if (this.numberOfEmployees > 10) {
            percentage = 0.14;
        } else {
            percentage = 0.16;
        }
        return getAnnualIncome() * percentage;
    }
}
