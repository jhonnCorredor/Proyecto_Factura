package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Lending;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface ILendingRepository extends IBaseRepository<Lending, Long>{

}
