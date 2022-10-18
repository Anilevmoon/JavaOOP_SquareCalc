package claSsic;

import WinApp.*;
import javax.swing.SwingUtilities;

import java.awt.Dimension;

import javax.swing.JFrame;
import prsTOcalc.Schet;

public class mainPRog {
//основний файл запуску додатку та використанн€ р≥зних метод≥в викликаних з ≥нших файл≥в
			public static void main(String[] args) {
		
				WindowsApp app = new WindowsApp();// створюЇмо об№Їкт WindowsApp
		
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new WindowsApp();
					}
				});
						// встановленн€ м≥н≥мального розм≥ру в≥кна
						app.setMinimumSize(new Dimension(500, 250));
						// встановленн€ дефолтного розм≥ру в≥кна та м≥сц€ по€вленн€ його
						app.setBounds(900, 120, 400, 250);
						// визначаЇмо видимость в≥кна
						app.setVisible(true);
		
		//				Schet.Calc();
	}
}
