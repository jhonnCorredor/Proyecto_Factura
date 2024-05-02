package com.sena.ecom.Service.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Parameter.Departament;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Parameter.IDepartamentRepository;
import com.sena.ecom.IService.Parameter.IDepartamentService;
import com.sena.ecom.Service.ABaseService;

@Service
public class DepartamentService extends ABaseService<Departament> implements IDepartamentService{

	@Autowired
	private IDepartamentRepository repository;
	
	@Override
	protected IBaseRepository<Departament, Long> getRepository() {
		return repository;
	}

}
