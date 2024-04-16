package HelloWorld.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("http://localhost:8080/api")
public class ApiControllers {
    @GetMapping("/hello")
    public String hello(){
        return "hello_world!";
    }
}
