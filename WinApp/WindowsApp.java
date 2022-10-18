package WinApp;

import java.awt.*;
import javax.swing.*;

import prsTOcalc.Schet;

import java.awt.event.*;


public class WindowsApp extends JFrame {
    private Form form;

    
    public WindowsApp(){
		super("Square_Equation"); 

        form = new Form();	 
	    
        
        form.setFormListener(new FormListener() {
        	 public void formEventOccured(FormEvent ev) {
        		// запис данних з полів вводу
        		 String First = ev.getFirst();
        		 String Second =  ev.getSecond();
        		 String Third  = ev.getThird();
        		 //повторна перевірка данних на відповідність умовам
        		 if(ev.isNumeric(First) && ev.isNumeric(Second) && ev.isNumeric(Third)){
        			 //математичні підрахунки та запис у змінні
          		 double a = Double.parseDouble(First);
          		 double b =  Double.parseDouble(Second);
          		 double c = Double.parseDouble(Third);
	 
        		 double Disc = (Math.pow(b, 2))-(4*a*c);
		        		 if(Disc < 0) {
		        			 form.setROot1("NO");
		                     form.setROot2("ROOTS");
		        		 }
		        		 else {
		        		 double x1 = (-b + Math.sqrt(Disc))/2;
		        		 double x2 = (-b - Math.sqrt(Disc))/2;
		        		 String result1 = String.format("%.4f",x1);
		        		 String result2 = String.format("%.4f",x2);
		        		 form.setROot1(result1);
		                 form.setROot2(result2);
		        		 }
		          		 
		                  }
        		 else {
        			 //перестраховочний вивід помилки на випадок непередбачуваних символів-багів
                   form.setROot1("Error!!");
                   form.setROot2("Error!!");
        		}
        	}
        		 
        	        	 });
        
	    add(form, BorderLayout.CENTER);
	    
	   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    	    	 }
					}
