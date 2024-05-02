package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Inventory;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IInventoryRepository extends IBaseRepository<Inventory, Long>{

}
