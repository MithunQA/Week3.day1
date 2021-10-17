package week3.day1;

public interface TaxCalculation {
	
	//Un-implemented Methods
	
	/**
	 * This method calculates the deductions of a person/business unit/co-operative society 
	 * Author: Mithun
	 * 
	 * @param name
	 * @param HRA
	 * @param LTA
	 */
	void calcDeductions (String name, double HRA, double LTA);
	
	/**
	 * This method calculates the gross Income
	 *  Author: Mithun
	 * 
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	void commonTax();
	

}
