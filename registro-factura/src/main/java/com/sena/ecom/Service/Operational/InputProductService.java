package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.InputProduct;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInputProductRepository;
import com.sena.ecom.IService.Operational.IInputProductService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InputProductService extends ABaseService<InputProduct> implements IInputProductService{

	@Autowired
	private IInputProductRepository repository;
	
	@Override
	protected IBaseRepository<InputProduct, Long> getRepository() {
		return repository;
	}

}
