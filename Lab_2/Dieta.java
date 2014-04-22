
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Dieta {
	static int Massa;

	public static void main (String args []) throws Exception {
			Scanner d = new Scanner(System.in);
			System.out.println("Введите массу");
			try {
				Massa=MyException.Get(d.nextInt());
			} catch (InputMismatchException e){
				System.out.println("Вы ввели не число");
			} catch (MyException e) {
				System.out.println("Число не может быть отрицательным") ;
			}
			//System.out.println(Massa);
	}
}