package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Municipality;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.IMunicipalityRepository;
import com.sena.ecom.IService.Parameter.IMunicipalityService;
import com.sena.ecom.Service.ABaseService;

@Service
public class MunicipalityService extends ABaseService<Municipality> implements IMunicipalityService{

	@Autowired
	private IMunicipalityRepository repository;
	
	@Override
	protected IBaseRepository<Municipality, Long> getRepository() {
		return repository;
	}

}
