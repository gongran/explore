package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HelloWorld {
	protected static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	@RequestMapping("/")
	@ResponseBody
	String home() {
		logger.debug("访问hello");
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorld.class, args);
	}

}
