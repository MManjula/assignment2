package com.training.junit.taxdepartment;

import com.training.junit.taxdepartment.myexception.SalaryOutOfRangeException;

/**
 * 
 * @author MManjula
 *
 * @param <S>
 */
public class TaxDepartment<S> {
	/**
	 * 
	 * @param salary
	 * @return the amount of tax which is calculated on the basis of salary
	 * @throws SalaryOutOfRangeException
	 */
	public double calTax(double salary) throws SalaryOutOfRangeException {
		if (salary >= 0 && salary <= 180000)
			return 0;
		else if (salary >= 180001 && salary <= 300000)
			return 0.1 * salary;
		else if (salary >= 300001 && salary <= 500000)
			return 0.2 * salary;
		else if (salary >= 500001 && salary <= 1000000)
			return 0.3 * salary;
		else
			throw new SalaryOutOfRangeException("Amount out of range");
	}

}
