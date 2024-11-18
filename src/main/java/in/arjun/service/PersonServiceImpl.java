package in.arjun.service;

import in.arjun.collection.Person;
import in.arjun.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;
    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return  personRepository.findPersonByFirstName(name);

    }

    @Override
    public void deleteById(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getPersonsByAge(Integer maxAge,Integer minAge) {
        return personRepository.findPersonByAgeBetween(maxAge,minAge);
    }


}
