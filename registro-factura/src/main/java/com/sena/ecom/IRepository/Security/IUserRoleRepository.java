package com.sena.ecom.IRepository.Security;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Security.UserRole;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IUserRoleRepository extends IBaseRepository<UserRole, Long>{

}
