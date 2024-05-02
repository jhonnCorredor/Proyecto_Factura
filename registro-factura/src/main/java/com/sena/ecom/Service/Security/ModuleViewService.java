package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.ModuleView;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IModuleViewRepository;
import com.sena.ecom.IService.Security.IModuleViewService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ModuleViewService extends ABaseService<ModuleView> implements IModuleViewService{

	@Autowired
	private IModuleViewRepository repository;
	
	@Override
	protected IBaseRepository<ModuleView, Long> getRepository() {
		return repository;
	}

}
