package com.dzy;

import com.dzy.dao.PersonRepository;
import com.dzy.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void contextLoads() {
        Person person = new Person(1l, "zhangsan", 10, "地址一枚");
        System.out.println(personRepository.save(person));
    }

}
