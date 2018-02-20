package bean;

import org.springframework.stereotype.Component;

@Component("korDao")
public class KorMessageDaoImpl implements MessageDao {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "안녕하세요? 반갑습니다.";
	}

}
