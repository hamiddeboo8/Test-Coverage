package com.unittest.codecoverage.newTest;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonRepoTest {

    @Test
    public void repoInsertTest(){
        Person p = new Person();
        p.setName("Javad");
        p.setAge(20);
        p.setGender(Gender.M);

        PersonRepository pr = new PersonRepository();
        Person p1 = pr.insert(p);
        assertEquals(p1,p);
    }

    @Test
    public void repoUpdateTest(){
        Person p = new Person();
        p.setName("Homa");
        p.setAge(22);
        p.setGender(Gender.F);

        PersonRepository pr = new PersonRepository();
        pr.update(p);
    }
}
