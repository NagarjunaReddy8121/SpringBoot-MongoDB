package in.arjun.repository;

import in.arjun.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
    List<Person> findPersonByFirstName(String name);

    @Query(value = "{'age' :{$gt : ?1, $lt : ?0}}")
    List<Person> findPersonByAgeBetween(Integer maxAge,Integer minAge);
}
