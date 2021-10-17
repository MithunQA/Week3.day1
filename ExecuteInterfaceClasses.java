package week3.day1;

public class ExecuteInterfaceClasses {

	public static void main(String[] args) {
		
		CalcTaxIndividuals calTax = new CalcTaxIndividuals();
		
		//Interface methods
		calTax.calcDeductions("Emp1", 1001.11, 250);
		calTax.calcGrossIncome("Emp2", 2510.90, 600);
		
		//Class Own methods
		calTax.taxSlab();
		calTax.totalIncome();
		calTax.reduceTax();
		
		//Interface-2 Methods
		calTax.calGrossIncome();
		calTax.removeDeductions();
		

	}

}
