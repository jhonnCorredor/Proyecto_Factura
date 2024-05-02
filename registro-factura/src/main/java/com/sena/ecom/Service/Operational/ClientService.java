package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Client;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IClientRepository;
import com.sena.ecom.IService.Operational.IClientService;
import com.sena.ecom.Service.ABaseService;

@Service
public class ClientService extends ABaseService<Client> implements IClientService{

	@Autowired
	private IClientRepository repository;
	
	@Override
	protected IBaseRepository<Client, Long> getRepository() {
		return repository;
	}

}
