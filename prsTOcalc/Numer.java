package prsTOcalc;

import java.util.Scanner;

public class Numer {

	Scanner numb = new Scanner(System.in);

	// метод що считує введені данні
	public static int getInt() {

		Numer a = new Numer();
		Scanner numer = a.numb;

		System.out.println("Введите число:");
		int num;
		// перевірка на невідповідні символи
		if (numer.hasNextInt()) {
			num = numer.nextInt();
		} else {
			System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
			num = getInt();
		}
		return num;
	}

}
