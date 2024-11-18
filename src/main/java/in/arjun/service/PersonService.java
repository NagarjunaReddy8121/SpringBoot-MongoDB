package in.arjun.service;

import in.arjun.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonByName(String name);

    void deleteById(String id);

    List<Person> getPersonsByAge(Integer maxAge,Integer minAge);
}
