/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.service;

import java.util.List;

import com.springapp.mvc.domain.Test;
import com.springapp.mvc.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Пользователь
 */
@Service("testService")
@Repository
public class TestServiceImpl implements TestService {
    
    @Autowired
    private TestRepository testRepository;

  /*  @Override
    public List<Xml> findByFirstName(String firstName) {
        return xmlRepository.findByFirstName(firstName);
    }*/

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Test insertOrUpdate(Test test) {
        return testRepository.save(test);
    }

    @Override
    public void delete(Integer id) {
        testRepository.delete(id);
    }

    @Override
    public List<Test> findAll() {
        return (List<Test>) testRepository.findAll();
    }
    
}
