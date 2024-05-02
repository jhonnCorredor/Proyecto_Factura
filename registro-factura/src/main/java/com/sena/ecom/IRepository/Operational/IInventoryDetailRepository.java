package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.InventoryDetail;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IInventoryDetailRepository extends IBaseRepository<InventoryDetail, Long>{

}
