package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Neighborhood;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.INeighborhoodRepository;
import com.sena.ecom.IService.Parameter.INeighborhoodService;
import com.sena.ecom.Service.ABaseService;

@Service
public class NeighborhoodService extends ABaseService<Neighborhood> implements INeighborhoodService{

	@Autowired
	private INeighborhoodRepository repository;
	
	@Override
	protected IBaseRepository<Neighborhood, Long> getRepository() {
		return repository;
	}

}
