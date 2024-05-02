package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Lending;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.ILendingRepository;
import com.sena.ecom.IService.Operational.ILendingService;
import com.sena.ecom.Service.ABaseService;

@Service
public class LendingService extends ABaseService<Lending> implements ILendingService{

	@Autowired
	private ILendingRepository repository;
	
	@Override
	protected IBaseRepository<Lending, Long> getRepository() {
		return repository;
	}

}
