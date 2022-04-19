package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String sayHello() {
		return "simpleInterest";
	}
}
