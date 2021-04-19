package by.brest.mts.portal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;

    private String name;
    private String surname;
    private int age;
    private String position;


    public Person() {
    }

}
