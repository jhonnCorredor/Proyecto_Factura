package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.User;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IUserRepository;
import com.sena.ecom.IService.Security.IUserService;
import com.sena.ecom.Service.ABaseService;

@Service
public class UserService extends ABaseService<User> implements IUserService{

	@Autowired
	private IUserRepository repository;
	
	@Override
	protected IBaseRepository<User, Long> getRepository() {
		return repository;
	}

}
