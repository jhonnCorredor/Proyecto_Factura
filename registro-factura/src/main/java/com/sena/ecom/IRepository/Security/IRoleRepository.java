package com.sena.ecom.IRepository.Security;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Security.Role;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IRoleRepository extends IBaseRepository<Role, Long>{

}
