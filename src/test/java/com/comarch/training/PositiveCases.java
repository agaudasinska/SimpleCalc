package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test()
	public void AddingTest() {

		// Given
		int x = 5;
		int y = 10;

		// When
		int z = simpleCalculator.add(x, y);

		// Than
		Assert.assertEquals(z, 15);

	}

	@Test()
	public void MinusTest() {

		// Given
		int x = 10;
		int y = 5;
		// When
		int z = simpleCalculator.minus(x, y);
		// then
		Assert.assertEquals(z, 5);
	}

	@Test()
	public void MultiplyTest() {
		
		// given
		int x = 10;
		int y = 5;
		// when
		int z = simpleCalculator.multiply(x, y);
		// then
		Assert.assertEquals(z, 50);
	}

	@Test()
	public void divideTest() {

		// given
		int x = 10;
		int y = 5;
		// when
		float z = simpleCalculator.divide(x, y);
		// then
		Assert.assertEquals(z, 2.0);
	}
	
	
	@Test
	public void AddingToMemory(){
		//given
		//when
		//then
	}

}
