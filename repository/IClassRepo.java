package com.fetchdata.repository;

import com.fetchdata.model.Class;
import java.util.List;

public interface IClassRepo {

    List <Class> fetchAll();

    Class findPersonById(int id);

    Class addPerson(Class p);

    Class deletePerson(int id);

    Class updatePerson(int id, Class p);
}
