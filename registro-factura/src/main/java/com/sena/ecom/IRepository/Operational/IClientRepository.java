package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Client;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IClientRepository extends IBaseRepository<Client, Long>{

}
