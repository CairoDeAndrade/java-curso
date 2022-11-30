package entities;

public class Company extends TaxPayer{
	
	private Integer employeesQuantity;

	public Company(String name, Double annualIncome, Integer employeesQuantity) {
		super(name, annualIncome);
		this.employeesQuantity = employeesQuantity;
	}

	public Integer getEmployeesQuantity() {
		return employeesQuantity;
	}

	public void setEmployeesQuantity(Integer employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}

	@Override
	public Double incomeTax() {
		if (employeesQuantity > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}
}
