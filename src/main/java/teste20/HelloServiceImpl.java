package teste20;

import javax.jws.WebService;

//Coloca em EnpointInterface em minusculo colocar a correção
@WebService(endpointInterface="com.org.HelloWebService",
serviceName="HelloService")
public class HelloServiceImpl implements HelloWebService {
	
	@Override
	public String hiMule(String str) throws Exception {
		// TODO Auto-generated method stub
		return "Hello "+str;
		}
	
}
