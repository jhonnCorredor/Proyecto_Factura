package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Country;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.ICountryRepository;
import com.sena.ecom.IService.Parameter.ICountryService;
import com.sena.ecom.Service.ABaseService;

@Service
public class CountryService extends ABaseService<Country> implements ICountryService{

	@Autowired
	private ICountryRepository repository;
	
	@Override
	protected IBaseRepository<Country, Long> getRepository() {
		return repository;
	}

}
