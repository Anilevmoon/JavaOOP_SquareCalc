package claSsic;

import WinApp.*;
import javax.swing.SwingUtilities;

import java.awt.Dimension;

import javax.swing.JFrame;
import prsTOcalc.Schet;

public class mainPRog {
//�������� ���� ������� ������� �� ������������ ����� ������ ���������� � ����� �����
			public static void main(String[] args) {
		
				WindowsApp app = new WindowsApp();// ��������� ��ܺ�� WindowsApp
		
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new WindowsApp();
					}
				});
						// ������������ ���������� ������ ����
						app.setMinimumSize(new Dimension(500, 250));
						// ������������ ���������� ������ ���� �� ���� ��������� ����
						app.setBounds(900, 120, 400, 250);
						// ��������� ��������� ����
						app.setVisible(true);
		
		//				Schet.Calc();
	}
}
