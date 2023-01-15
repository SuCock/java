package com.yedam.object;

import java.util.Calendar;

public class CalcuatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.sum(10, 20);
		System.out.println(result);

		Calculator calc1 = new Calculator();
		int result1 = calc1.sum(10, 20);
		System.out.println(result1);

		System.out.println(calc == calc1);

		CalculatorSingle calcSingle1 = CalculatorSingle.getInstance();
		CalculatorSingle calcSingle2 = CalculatorSingle.getInstance();
		System.out.println(calcSingle1 == calcSingle2);

		Calendar today = Calendar.getInstance(); // getInstance자체가 싱글톤으로 구현이 되어있어 참조하는 것
		today.set(2023, 2, 1);
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
	}
}