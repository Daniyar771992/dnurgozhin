package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
	
	private static final double RATION = 1.15;
	private static final double FOR_MAN = 100;
	private static final double FOR_WOMAN = 110;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - FOR_MAN) * RATION;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - FOR_WOMAN) * RATION;
    }
}