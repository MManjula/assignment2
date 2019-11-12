package com.training.junit.testIncomeTax;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.junit.taxdepartment.TaxDepartment;
import com.training.junit.taxdepartment.myexception.SalaryOutOfRangeException;

public class TestIncomeTax {
	private TaxDepartment<Object> salary;

	@Before
	public void setUp() {
		salary = new TaxDepartment<Object>();
	}

	@Test
	public void testTaxForSlabA() throws SalaryOutOfRangeException {
		assertEquals("nill", 0, salary.calTax(150000), 0.02);
	}

	@Test
	public void testTaxForSlabB() throws SalaryOutOfRangeException {
		assertEquals(26159.6, salary.calTax(261596), 0.02);
	}

	@Test
	public void testTaxForSlabC() throws SalaryOutOfRangeException {
		assertEquals(60000.2, salary.calTax(300001), 0.02);
	}

	@Test
	public void testTaxForSlabD() throws SalaryOutOfRangeException {
		assertEquals(295951.35, salary.calTax(986504.5), 0.02);
	}

	@Test(expected = SalaryOutOfRangeException.class)
	public void testOutOfRangeSalary() throws SalaryOutOfRangeException {
		salary.calTax(1500000);
	}

	@After
	public void tearDown() {
		salary = null;
	}

}
