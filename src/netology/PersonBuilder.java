package netology;

import java.util.Optional;
import java.util.OptionalInt;

public class PersonBuilder {
    private  String name;
    private  String surname;
    private int age = -1;
    private String city;

    public PersonBuilder(){};

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(Integer age) throws IllegalStateException {
        this.age = age;
        if (this.age < 0) {
            throw new IllegalStateException("your age can't be less than 0");
        }
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.city = city;
        if (this.surname == null) {
            throw new IllegalStateException("No address");
        }
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("No surname or name");
            return null;
        }
        if (this.city == null) {
            return new Person(this.name, this.surname);
        } else {
            if (this.age < 0) {
                return new Person(this.name, this.surname, this.city);
            }
        }

        return new Person(this.name, this.surname, this.age, this.city);
    }

}