package HelloWorld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
//	Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//			context.close();
//			System.out.println("Application terminated gracefully.");
//		}));
	}

}
