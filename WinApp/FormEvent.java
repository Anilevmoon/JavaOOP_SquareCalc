package WinApp;

import java.util.EventObject;

import javax.swing.JFrame;

public class FormEvent extends EventObject {
	// ��*������� ������
	String First, Second, Third;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String First, String Second, String Third) {
		super(source);
		this.First = First;
		this.Second = Second;
		this.Third = Third;
	}

	// ����� ������
	public String getFirst() {
		return First;
	}

	public String getSecond() {
		return Second;
	}

	public String getThird() {
		return Third;
	}

	// ������� ������ � ���� String � ��� Double.
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
