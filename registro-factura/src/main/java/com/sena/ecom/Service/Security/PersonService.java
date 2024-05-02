package com.sena.ecom.Service.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Security.Person;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Security.IPersonRepository;
import com.sena.ecom.IService.Security.IPersonService;
import com.sena.ecom.Service.ABaseService;

@Service
public class PersonService extends ABaseService<Person> implements IPersonService{

	@Autowired
	private IPersonRepository repository;
	
	@Override
	protected IBaseRepository<Person, Long> getRepository() {
		return repository;
	}

}
