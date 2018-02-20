package annotation03;

import java.lang.reflect.InvocationTargetException;

public class TestDrive {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		Invoker i = new Invoker();
		try {
			i.invoke(a);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
