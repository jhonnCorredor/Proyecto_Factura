package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Category;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.ICategoryRepository;
import com.sena.ecom.IService.Operational.ICategoryService;
import com.sena.ecom.Service.ABaseService;

@Service
public class CategoryService extends ABaseService<Category> implements ICategoryService{

	@Autowired
	private ICategoryRepository repository;
	
	@Override
	protected IBaseRepository<Category, Long> getRepository() {
		return repository;
	}

}
