package be.intecbrussel.generetics.optionals;

import java.util.Optional;

public class PersonRepository {
    private Person[] people;

    public PersonRepository() {
        people = new Person[5];
        people[0] = new Person("Jean", 12);
        people[1] = new Person("Bob", 16);
        people[2] = new Person("Tom", 7);
        people[3] = new Person("Robert", 33);
        people[4] = new Person("Paul", 26);
    }

    public Optional<Person> findByName (String name) {
        for (Person person : people) {
            if(person.getName().equalsIgnoreCase(name)) {
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }
}
