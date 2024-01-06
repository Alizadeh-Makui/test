package ir.pt.sakhad.service;

import ir.pt.sakhad.dao.PersonDao;
import ir.pt.sakhad.entity.PersonEntity;
import ir.pt.sakhad.model.PersonModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//  در این بخش Business Logic ها نوشته میشوند که میتوان جداگانه پاده سازی کرد (impl)

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;

    public String concat(String init){
        PersonModel personModel = new PersonModel();
        return (personModel.getName() + personModel.getFamily());
    }
    public PersonEntity findById(Integer id){
        return personDao.findById(id).get();
    }

    public List<PersonEntity> findByName(String name){
        return personDao.findAllByFullNameContaining(name);
    }

    public void insert(PersonEntity personEntity){
        personDao.save(personEntity);
    }

    public void delete(PersonEntity personEntity) {
        personDao.deleteById(personEntity.getId());
    }

    @Transactional()
    public boolean insert(PersonModel personModel){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(personModel.getId());
        personEntity.setFullName(personModel.getName() + " " +  personModel.getFamily());
        personDao.save(personEntity);
        return true;
    }
}
