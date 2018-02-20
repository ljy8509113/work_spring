package annotation02;

import java.lang.reflect.Field;

public class Validator {

	public boolean validate(Object obj) throws IllegalArgumentException, IllegalAccessException {
		boolean pass = true;
		System.out.println(obj);
		
		Field[]fields = obj.getClass().getDeclaredFields();
		
		for(Field f : fields) {
			f.setAccessible(true);
			
			if(f.getAnnotation(Validation.class) != null) {
				Validation anno = f.getAnnotation(Validation.class);
				
				int valInt = 0;
				String valStr = null;
				Class<?> type = f.getType();
				
				if(type.getName().equals("int")) {
					valInt = f.getInt(obj);
					if(anno.required() && valInt== 0) {
						pass = false;
						System.out.println(f.getName() + "는 필수로 입력해야함.("+valInt+")");
					}else if(anno.max() < valInt || valInt < anno.min()) {
						pass = false;
						System.out.println(f.getName() + " 입력범위를 벗어남 : " +valInt);
					}
				}else if(type.getName().equals("java.lang.String")) {
					if(f.get(obj) != null) {
						valStr=f.get(obj).toString();
					}
					
					if(anno.required() && valStr == null) {
						pass = false;
						System.out.println(f.getName() + " 필수 입력.");
					}else if(valStr != null && anno.maxLength() < valStr.length()) {
						pass = false;
						System.out.println(f.getName() + " 입력범위를 벗어남.");
					}
				}
			}
		}
		
		return pass;
	}
}
