package prsTOcalc;
//консольний варіант додатку з перевіркою на введені
//символи і виведення сповіщення про помилку
public class Schet {
	
	 int First = Numer.getInt();
	 int Second = Numer.getInt();
	 int Third = Numer.getInt();
	 
	 public static void Calc(){
		 Schet k = new Schet();
		 //запис данних у змінні
		   double a = k.First;
		   double b = k.Second;
		   double c = k.Third;
		 //математичні розрахунки
		 double Disc = (Math.pow(b, 2))-(4*a*c);
		 if(Disc < 0) {
			System.out.println("NOANSWER"); 
		 }
		 else {
			 double x1 = (-b + Math.sqrt(Disc))/2;
			 double x2 = (-b - Math.sqrt(Disc))/2;
		 //вивід данних
		 System.out.println("X1="+ x1 +" "+"X2="+x2);
		 }
	 }
	
}
