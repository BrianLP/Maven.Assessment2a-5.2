package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    Long id;
    Person owner;
    Address address;

    public Animal() {
        
        this.setOwner(new Person());
        this.address = new Address();
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return this.owner.getAddress();
    }
}
