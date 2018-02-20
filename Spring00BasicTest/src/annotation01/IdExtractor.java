package annotation01;

import java.lang.reflect.Field;

public class IdExtractor {
	
	public String extractId(Object obj) {
		String id = null;
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field f : fields) {
			if(f.getAnnotation(ObjectId.class) != null) {
				//필드 접근 가능 private 이어도 접근이 됨.
				f.setAccessible(true);
				try {
					Object value = f.get(obj);
					if(value != null)
						id = value.toString();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		return id;
	}
	
}
