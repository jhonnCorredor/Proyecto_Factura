package com.sena.ecom.IRepository.Security;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Security.Module;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IModuleRepository extends IBaseRepository<Module, Long>{

}
