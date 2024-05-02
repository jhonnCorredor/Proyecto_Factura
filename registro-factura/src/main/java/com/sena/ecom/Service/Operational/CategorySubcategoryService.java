package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.CategorySubcategory;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.ICategorySubcategoryRepository;
import com.sena.ecom.IService.Operational.ICategorySubcategoryService;
import com.sena.ecom.Service.ABaseService;

@Service
public class CategorySubcategoryService extends ABaseService<CategorySubcategory> implements ICategorySubcategoryService{

	@Autowired
	private ICategorySubcategoryRepository repository;
	
	@Override
	protected IBaseRepository<CategorySubcategory, Long> getRepository() {
		return repository;
	}

}
