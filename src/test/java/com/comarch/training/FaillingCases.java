package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaillingCases {

	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@DataProvider(name = "Test")
	public Object[][] dataProviderMethod() {
		return new Object[][] {{2,2},{2,4}};
	}
	 

	@Test(groups = { "AddingTest" }, dataProvider = "Test")
	public void AddingTest(int x, int y) {

		// Given
		//int x = 5;
		//int y = 10;

		// When
		int z = simpleCalculator.add(x, y);

		// Than
		Assert.assertEquals(z, x+y);

	}

	@Test(groups = { "MultiplyTest" }, dependsOnMethods = { "MinusTest" })
	public void MultiplyTest() {

		// given
		int x = 10;
		int y = 5;
		// when
		int z = simpleCalculator.multiply(x, y);
		// then
		Assert.assertEquals(z, 50);
	}

	@Test(groups = { "divideTest" }, dependsOnMethods = { "MinusTest" })
	public void divideTest() {

		// given
		int x = 10;
		int y = 5;
		// when
		float z = simpleCalculator.divide(x, y);
		// then
		Assert.assertEquals(z, 2.0);
	}

	@Test(groups = { "MinusTest" })
	public void MinusTest() {

		// Given
		int x = 10;
		int y = 5;
		// When
		int z = simpleCalculator.minus(x, y);
		// then
		Assert.assertEquals(z, 5);
	}

}
