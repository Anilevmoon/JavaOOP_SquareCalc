package prsTOcalc;

import java.util.Scanner;

public class Numer {

	Scanner numb = new Scanner(System.in);

	// ����� �� ����� ������ ����
	public static int getInt() {

		Numer a = new Numer();
		Scanner numer = a.numb;

		System.out.println("������� �����:");
		int num;
		// �������� �� ��������� �������
		if (numer.hasNextInt()) {
			num = numer.nextInt();
		} else {
			System.out.println("�� ��������� ������ ��� ����� �����. ���������� ��� ���.");
			num = getInt();
		}
		return num;
	}

}
