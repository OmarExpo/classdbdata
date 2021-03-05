package com.fetchdata.service;

import com.fetchdata.model.Class;
import com.fetchdata.repository.IClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    IClassRepo spellRepo;

    @Override
    public List<Class> fetchAll() {
        return spellRepo.fetchAll();
    }

    @Override
    public Class findPersonById(int id) {
        return spellRepo.findPersonById(id);
    }

    @Override
    public Class addPerson(Class p) {
        return spellRepo.addPerson(p);
    }

    @Override
    public Class deletePerson(int id) {
        return spellRepo.deletePerson(id);
    }

    @Override
    public Class updatePerson(int id, Class p) {
        return spellRepo.updatePerson(id, p);
    }
}
