package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public MyBean myBean() {
		return new MyBeanImpl();
	}
}
