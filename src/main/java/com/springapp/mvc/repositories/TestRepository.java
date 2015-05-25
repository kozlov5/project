/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.repositories;

import java.util.List;

import com.springapp.mvc.domain.Test;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Пользователь
 */
public interface TestRepository extends CrudRepository<Test, Integer> {
    //public List<Xml> findByFirstName(String firstName);    
}
