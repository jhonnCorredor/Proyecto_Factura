package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.InventoryDetail;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInventoryDetailRepository;
import com.sena.ecom.IService.Operational.IInventoryDetailService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InventoryDetailService extends ABaseService<InventoryDetail> implements IInventoryDetailService{

	@Autowired
	private IInventoryDetailRepository repository;
	
	@Override
	protected IBaseRepository<InventoryDetail, Long> getRepository() {
		return repository;
	}

}
