package by.brest.mts.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PortalRestController {

    @GetMapping("/hello")
    public String homePage() {
        System.out.println("hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }
    @GetMapping("/person")
    public Person getPerson() {
        Person person1 = new Person("Сергей", "Иванюклвич", 35, "TeamLid");
        return person1;
    }
    @GetMapping("/persons")
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Островский", "Руслан", 37, "Developer"));
        persons.add(new Person("Левченко", "Александр", 36, "Junior"));
        persons.add(new Person("Рагозинский", "Алексей", 35, "Junior"));
        persons.add(new Person("Якимчик", "Александр", 34, "Junior"));
        persons.add(new Person("Савицкий", "Владимир", 38, "Junior"));
        return persons;
    }

}
