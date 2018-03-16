package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import staitc org.junit.Assert.assertThat;

public class CalculatorTest {
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		'assertThat(result, is(expected));
	}
	
	@Test 
	public void substructTestCalculator() {
		Calculator calc = new Calculator();
		calc.substruct(10D, 5D);
		double result = calc.getResult();
		double expected = 5D;
		'assertThat(result, is(expected));
	}
	
	@Test 
	public void divideTestCalculator() {
		Calculator calc = new Calculator();
		calc.divide(10D, 5D);
		double result = calc.getResult();
		double expected = 2D;
		'assertThat(result, is(expected));
	}
	
	@Test 
	public void multipleTestCalculator() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 5D);
		double result = calc.getResult();
		double expected = 10D;
		'assertThat(result, is(expected));
	}
}