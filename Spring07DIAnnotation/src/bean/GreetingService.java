package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("greeting")
@Scope("singleton")
public class GreetingService {
	@Autowired
	@Qualifier("engDao")	//autowired 의 name 속성값 - 설정 안하면 byType 속성값
	private MessageDao dao;
	
	public GreetingService() {		
	}
	
	public GreetingService(MessageDao dao) {
		this.dao = dao;
	}

	public MessageDao getDao() {
		return dao;
	}

	public void setDao(MessageDao dao) {
		this.dao = dao;
	}
	
	public void sayHello() {
		System.out.println(dao.getMessage());
	}
	
}
