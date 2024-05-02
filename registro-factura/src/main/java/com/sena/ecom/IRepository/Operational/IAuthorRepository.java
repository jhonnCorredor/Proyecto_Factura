package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Author;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IAuthorRepository extends IBaseRepository<Author, Long>{

}
