package com.mycompagny.formationspring.demo.repository;

import com.mycompagny.formationspring.demo.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
