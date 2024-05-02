package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.Roleview;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IRoleViewRepository;
import com.sena.ecom.IService.Security.IRoleViewService;
import com.sena.ecom.Service.ABaseService;

@Service
public class RoleViewService extends ABaseService<Roleview> implements IRoleViewService{

	@Autowired
	private IRoleViewRepository repository;
	
	@Override
	protected IBaseRepository<Roleview, Long> getRepository() {
		return repository;
	}

}
