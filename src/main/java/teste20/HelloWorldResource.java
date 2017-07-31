package teste20;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/rest")
public class HelloWorldResource {
	
	@GET
	@Path("/teste")
	 @Produces(MediaType.TEXT_PLAIN)
	public String getWelcomeMsg () throws Exception {
	return "Hi MuleCookBook!!!!";
	}
	

}
