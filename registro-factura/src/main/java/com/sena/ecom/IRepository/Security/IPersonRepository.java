package com.sena.ecom.IRepository.Security;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Security.Person;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IPersonRepository extends IBaseRepository<Person, Long>{

}
