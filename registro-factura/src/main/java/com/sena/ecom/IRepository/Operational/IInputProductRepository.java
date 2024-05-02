package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.InputProduct;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IInputProductRepository extends IBaseRepository<InputProduct, Long>{

}
