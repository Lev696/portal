package by.brest.mts.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalRestController {

    @GetMapping("/person")
    public String homePage() {
        System.out.println("hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }

}
