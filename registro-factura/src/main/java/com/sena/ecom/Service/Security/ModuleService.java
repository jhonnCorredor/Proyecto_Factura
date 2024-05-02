package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.Module;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IModuleRepository;
import com.sena.ecom.IService.Security.IModuleService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ModuleService extends ABaseService<Module> implements IModuleService{

	@Autowired
	private IModuleRepository repository;
	
	@Override
	protected IBaseRepository<Module, Long> getRepository() {
		return repository;
	}

}
