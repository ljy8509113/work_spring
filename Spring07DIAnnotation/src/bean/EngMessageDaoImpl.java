package bean;

import org.springframework.stereotype.Component;

@Component("engDao")
public class EngMessageDaoImpl implements MessageDao {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello ENG";
	}

}
