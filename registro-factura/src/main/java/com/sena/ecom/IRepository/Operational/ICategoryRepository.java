package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Category;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface ICategoryRepository extends IBaseRepository<Category, Long>{

}
