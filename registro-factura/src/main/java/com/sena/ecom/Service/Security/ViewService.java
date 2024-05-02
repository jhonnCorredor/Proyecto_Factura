package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.View;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IViewRepository;
import com.sena.ecom.IService.Security.IViewService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ViewService extends ABaseService<View> implements IViewService{

	@Autowired
	private IViewRepository repository;
	
	@Override
	protected IBaseRepository<View, Long> getRepository() {
		return repository;
	}

}
