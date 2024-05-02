package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.UserRole;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IUserRoleRepository;
import com.sena.ecom.IService.Security.IUserRoleService;
import com.sena.ecom.Service.ABaseService;

@Service
public class UserRoleService extends ABaseService<UserRole> implements IUserRoleService{

	@Autowired
	private IUserRoleRepository repository;
	
	@Override
	protected IBaseRepository<UserRole, Long> getRepository() {
		return repository;
	}

}
