package annotation03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoker {
	public void invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cls = obj.getClass();
		Method[] methods = cls.getDeclaredMethods();
		Method[] methods2 = cls.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Call.class)) {
				Call anno = m.getAnnotation(Call.class);
				methods2[anno.seq() - 1] = m;
			}
		}
		
		for(Method m: methods2) {
			m.invoke(obj, null);
		}
	}
}
