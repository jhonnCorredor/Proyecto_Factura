package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Subcategory;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.ISubcategoryRepository;
import com.sena.ecom.IService.Operational.ISubcategoryService;
import com.sena.ecom.Service.ABaseService;

@Service
public class SubcategoryService extends ABaseService<Subcategory> implements ISubcategoryService{

	@Autowired
	private ISubcategoryRepository repository;
	
	@Override
	protected IBaseRepository<Subcategory, Long> getRepository() {
		return repository;
	}

}
