package in.arjun.controller;

import in.arjun.collection.Person;
import in.arjun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public String save(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping()
    public List<Person> getPersonByName(@RequestParam("name") String name){
       return personService.getPersonByName(name);
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable("id") String id){
        personService.deleteById(id);
    }

    @GetMapping("/age")
    public List<Person> getPersonsByAge(@RequestParam Integer maxAge,@RequestParam Integer minAge){
       return personService.getPersonsByAge(maxAge,minAge);
    }
}
