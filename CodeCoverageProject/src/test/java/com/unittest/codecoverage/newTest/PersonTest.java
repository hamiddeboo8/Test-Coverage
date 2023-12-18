package com.unittest.codecoverage.newTest;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void getAgeTest(){
        Person p = new Person();
        p.setName("Javad");
        p.setAge(32);
        p.setGender(Gender.M);

        assertEquals(p.getAge(),32);
    }
}
