package com.unittest.codecoverage.newTest;

import com.unittest.codecoverage.exceptions.PersonException;
import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    public void repoDeleteTest(){
        Person p = new Person();
        p.setName(null);
        p.setAge(71);
        p.setGender(Gender.F);

        PersonRepository pr = new PersonRepository();

        List<String> expectedErrors = Lists.newArrayList("name can't be null");
        String expectedMessage = String.join(";", expectedErrors);

        assertThatThrownBy(() -> pr.delete(p.getName()))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(expectedMessage);
    }
}
