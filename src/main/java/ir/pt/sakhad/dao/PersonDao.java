package ir.pt.sakhad.dao;

import ir.pt.sakhad.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// در این بخش query ها نوشته میشوند، interface هایی هستند که باید برایشان بدنه نوشته شود(impl)
@Repository
public interface PersonDao extends CrudRepository<PersonEntity, Integer> {
    List<PersonEntity> findAllByFullNameContaining(String name);

}
