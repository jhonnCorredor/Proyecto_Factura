package com.sena.ecom.IRepository.Security;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Security.User;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IUserRepository extends IBaseRepository<User, Long>{

}
