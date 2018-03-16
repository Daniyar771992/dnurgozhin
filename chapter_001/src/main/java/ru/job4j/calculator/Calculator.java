package ru.job4j.calculator;
    /**
	* Класс Калькулятор
    * @author Daniyar Nurgozhin
    * @version 1
    */

public class Calculator {
	/** Результат. */
	private double result;
	/**
	*
	* Сложение.
	* @param first первый аргумент
	* @param second второй аргумент
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	* Вычитание.
	* @param first первый аргумент
	* @param second второй аргумент
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	* Деление.
	* @param first первый аргумент
	* @param second второй аргумент
	*/
	public void divide(double first, double second) {
		this.result = first / second;
	}
	/**
	* Умножение.
	* @param first первый аргумент
	* @param second второй аргумент
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	* Результат.
	* @return результат
	*/
	public double getResult() {
		return this.result;
	}
}