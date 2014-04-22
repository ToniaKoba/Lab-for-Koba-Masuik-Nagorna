
public class MyException extends Exception {
	
	MyException(int a) {}
	static int Get(int a) throws MyException {
			if(a < 0) {
			throw new MyException(a);
			} else return a;
	}

}


