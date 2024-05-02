package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Product;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IProductRepository;
import com.sena.ecom.IService.Operational.IProductService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ProductService extends ABaseService<Product> implements IProductService{

	@Autowired
	private IProductRepository repository;
	
	@Override
	protected IBaseRepository<Product, Long> getRepository() {
		return repository;
	}

}
