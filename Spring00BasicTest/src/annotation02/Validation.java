package annotation02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validation {
	int max() default Integer.MAX_VALUE;
	int min() default Integer.MIN_VALUE;
	int maxLength() default 50;
	boolean required() default false;
}
