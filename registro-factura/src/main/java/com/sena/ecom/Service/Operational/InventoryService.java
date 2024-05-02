package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Inventory;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInventoryRepository;
import com.sena.ecom.IService.Operational.IInventoryService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InventoryService extends ABaseService<Inventory> implements IInventoryService{

	@Autowired
	private IInventoryRepository repository;
	
	@Override
	protected IBaseRepository<Inventory, Long> getRepository() {
		return repository;
	}

}
