package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Input;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInputRepository;
import com.sena.ecom.IService.Operational.IInputService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InputService extends ABaseService<Input> implements IInputService{

	@Autowired
	private IInputRepository repository;
	
	@Override
	protected IBaseRepository<Input, Long> getRepository() {
		return repository;
	}

}
