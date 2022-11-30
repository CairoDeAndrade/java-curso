package entities;

public class Individual extends TaxPayer{

	private Double healthExpenses;

	public Individual(String name, Double annualIncome, Double helthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = helthExpenses;
	}

	public Double getHelthExpenses() {
		return healthExpenses;
	}

	public void setHelthExpenses(Double helthExpenses) {
		this.healthExpenses = helthExpenses;
	}

	@Override
	public Double incomeTax() {
		if (getAnnualIncome() < 20000) {
			return getAnnualIncome() * 0.15 - healthExpenses * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenses * 0.5;
		}
	}
}
