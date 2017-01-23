package com.dzy.dao;

import com.dzy.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/1/23 0023.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    List findByAddress(String address);

    Person findByNameAndAddress(String name, String address);

    Person withNameAndAddressNamedQuery(String name, String address);
}
