package gagi.shmagi.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    PersonRepository people;

    @CrossOrigin
    @RequestMapping(
    method = RequestMethod.GET,
    path = "/people",
    produces = MediaType.APPLICATION_JSON_VALUE

    )
    public List<Person> getAllPersons(){
        return people.findAll();

    }

    @CrossOrigin
    @RequestMapping(
    method = RequestMethod.POST,
    path = "/people",
    produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE

    )
    public Person addPerson(@RequestBody Person person) {
        return people.save(person);

    }


}
