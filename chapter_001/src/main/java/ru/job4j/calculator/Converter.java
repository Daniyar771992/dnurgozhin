package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
 public class Convertor {
	/**
	 * Конвертируем рубди в евро.
	 * @param value рубли.
	 * @return Евро.
	 */
	public int rubleToEuro(int value) {
		int rate = 70;
		double euro =(double)value / rate;
		return euro;
	}
	
	/**
	 * Конвертируем рубли в доллоры.
	 * @param value рубли.
	 * @return Доллоры.
	 */
	public int rubleToDollar(int value) {
		 int rate = 60;
		 double dollar = (double)value / rate;
		 return dollar;
	}
	
	/**
	 * Конвертируем евро в рубли.
	 * @param value рубли.
	 * @return Рубли.
	 */
	 public int rubleToDollar(int value) {
		 int rate = 70;
		 double ruble = (double)value * rate;
		 return ruble;
	}
	 
	/**
	 * Конвертируем доллоры в рубли.
	 * @param value рубли.
	 * @return Рубли.
	 */
	 public int rubleToDollar(int value) {
		 int rate = 60;
		 double ruble = (double)value * rate;
		 return ruble;
	}