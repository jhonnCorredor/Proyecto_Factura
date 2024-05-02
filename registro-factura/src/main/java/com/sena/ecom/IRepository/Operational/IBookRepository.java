package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Book;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IBookRepository extends IBaseRepository<Book, Long>{

}
