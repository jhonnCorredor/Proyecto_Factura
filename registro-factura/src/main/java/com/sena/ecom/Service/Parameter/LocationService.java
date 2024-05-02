package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Location;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.ILocationRepository;
import com.sena.ecom.IService.Parameter.ILocationService;
import com.sena.ecom.Service.ABaseService;

@Service
public class LocationService extends ABaseService<Location> implements ILocationService{

	@Autowired
	private ILocationRepository repository;
	
	@Override
	protected IBaseRepository<Location, Long> getRepository() {
		return repository;
	}

}
