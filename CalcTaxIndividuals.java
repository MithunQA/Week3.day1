package week3.day1;

public class CalcTaxIndividuals implements TaxCalculation, IncomeCalculation {

	//From TaxCalculation Class
	
	public void calcDeductions(String name, double HRA, double LTA) {
		
		System.out.println("Individual calcDeductions");
		
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		
		System.out.println("Individual calcGrossIncome");
		
	}
	
	//methods of this class
	
	public void totalIncome() {
		
		System.out.println("Calculate Total income");

	}
	
	public void taxSlab() {
	
		System.out.println("Calculate Tax Slab");
		
	}
	
	public void reduceTax() {
		
		System.out.println("Reduce Tax");
		
	}

	public void commonTax() {
		
		
	}

	public void calGrossIncome() {
		
		System.out.println("Gross income - Interface 2");
		
	}

	public void removeDeductions() {
		
		System.out.println("Remove Deductions - Interface 2");
		
	}
	
	
	

}
