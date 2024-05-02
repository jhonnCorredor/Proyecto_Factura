package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.UnitofMeasure;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IUnitofMeasureRepository;
import com.sena.ecom.IService.Operational.IUnitofMeasureService;
import com.sena.ecom.Service.ABaseService;

@Service
public class UnitofMeasureService extends ABaseService<UnitofMeasure> implements IUnitofMeasureService{

	@Autowired
	private IUnitofMeasureRepository repository;
	
	@Override
	protected IBaseRepository<UnitofMeasure, Long> getRepository() {
		return repository;
	}

}
