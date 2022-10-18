package WinApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form extends JPanel {
	//створення елементів додатку
	private JLabel First, Second, Third, Root1, Root2;
	private JTextField FirstField, SecondField, ThirdField, Root1Field, Root2Field;
	private JButton Calculate, Erase, Exit;

	private FormListener formListener;

	public void setFormListener(FormListener listener) {
		this.formListener = listener;
	}
	//"направлення" данних у змінних на потрібні поля
	public void setROot1(String X1) {
		Root1Field.setText(X1);
	}

	public void setROot2(String X2) {
		Root2Field.setText(X2);
	}
	
// призначення елементам значень, розмірів
	Form() {
		Dimension dim = this.getPreferredSize();
		dim.width = 220;
		setPreferredSize(dim);

		First = new JLabel("X ^ 2" +" +");
		Second = new JLabel("X " + "+ ");
		Third = new JLabel("    =" + "   0 ");
		Root1 = new JLabel("   Root1:");
		Root2 = new JLabel("Root2:        ");

		Calculate = new JButton("Calculate ");
		Erase = new JButton("Erase");
		Exit = new JButton("Quit");

		FirstField = new JTextField(5);
		SecondField = new JTextField(5);
		ThirdField = new JTextField(5);
		
		Root1Field = new JTextField(5);
		Root1Field.setEditable(false);

		Root2Field = new JTextField(5);
		Root2Field.setEditable(false);
		
		
		//Ігнорування введених букв, або інших знаків окрім цифор та точки.
		FirstField.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_PERIOD)&& (c != KeyEvent.VK_MINUS)) {
			         e.consume();  
			      }
			   }
			});
		SecondField.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_PERIOD)&& (c != KeyEvent.VK_MINUS)) {
			         e.consume();  
			      }
			   }
			});
		ThirdField.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_PERIOD)&& (c != KeyEvent.VK_MINUS)) {
			         e.consume();  
			      }
			   }
			});

		
		//визначення дій кнопок при натисканні
		Erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstField.setText("");
				SecondField.setText("");
				ThirdField.setText("");
				Root1Field.setText("");
				Root2Field.setText("");
				FirstField.setEditable(true);
				SecondField.setEditable(true);
				ThirdField.setEditable(true);
			}
		});

		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String First = FirstField.getText();
				String Second = SecondField.getText();
				String Third = ThirdField.getText();
				FormEvent ev = new FormEvent(this, First, Second, Third);
				if (formListener != null)
					FirstField.setEditable(false);
				SecondField.setEditable(false);
				ThirdField.setEditable(false);
				formListener.formEventOccured(ev);
			}
		});

		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
//визначення положення елементів у вікні додатку
		GridBagConstraints gc = new GridBagConstraints();

		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 0;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		add(FirstField, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		add(First, gc);

		gc.gridx = 2;
		gc.gridy = 0;
		add(SecondField, gc);

		gc.gridx = 3;
		gc.gridy = 0;
		add(Second, gc);

		gc.gridx = 4;
		gc.gridy = 0;
		add(ThirdField, gc);

		gc.gridx = 5;
		gc.gridy = 0;
		add(Third, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		add(Root1, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		add(Root1Field, gc);

		gc.gridx = 3;
		gc.gridy = 1;
		add(Root2, gc);

		gc.gridx = 4;
		gc.gridy = 1;
		add(Root2Field, gc);

		gc.gridx = 0;
		gc.gridy = 2;
		add(Calculate, gc);

		gc.gridx = 2;
		gc.gridy = 2;
		add(Erase, gc);

		gc.gridx = 5;
		gc.gridy = 2;
		add(Exit, gc);

	}

}