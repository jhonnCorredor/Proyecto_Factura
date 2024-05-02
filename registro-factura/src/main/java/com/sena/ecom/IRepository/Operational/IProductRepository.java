package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Product;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IProductRepository extends IBaseRepository<Product, Long>{

}
