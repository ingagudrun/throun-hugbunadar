package is.hi.flugleit;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class App {
    @RequestMapping("/")
    String home() {
        return "Hello world!";
    }

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
