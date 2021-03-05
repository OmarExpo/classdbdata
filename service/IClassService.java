package com.fetchdata.service;

import com.fetchdata.model.Class;

import java.util.List;

public interface IClassService {

    List<Class> fetchAll();

    Class findPersonById(int id);

    Class addPerson(Class p);

    Class deletePerson(int id);

    Class updatePerson(int id, Class p);
}
