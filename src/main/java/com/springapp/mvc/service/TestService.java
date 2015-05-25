package com.springapp.mvc.service;

import com.springapp.mvc.domain.Test;

import java.util.List;

/**
 * Created by Asus on 25.05.2015.
 */
public interface TestService {
    public Test insertOrUpdate(Test test);
    public void delete(Integer id);
    public List<Test> findAll();
}
