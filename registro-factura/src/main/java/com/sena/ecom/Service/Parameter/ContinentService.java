package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Continent;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.IContinentRepository;
import com.sena.ecom.IService.Parameter.IContinentService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService{

	@Autowired
	private IContinentRepository repository;
	
	@Override
	protected IBaseRepository<Continent, Long> getRepository() {
		return repository;
	}

}
