package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.Role;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IRoleRepository;
import com.sena.ecom.IService.Security.IRoleService;
import com.sena.ecom.Service.ABaseService;

@Service
public class RoleService extends ABaseService<Role> implements IRoleService{

	@Autowired
	private IRoleRepository repository;
	
	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		return repository;
	}

}
