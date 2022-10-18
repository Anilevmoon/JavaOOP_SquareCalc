package WinApp;
//підключення та об*явлення відслідковування подій на кнопках
import java.util.EventListener;

public interface FormListener extends EventListener {
	 
	 public void formEventOccured(FormEvent ev);
}
