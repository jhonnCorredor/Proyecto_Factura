package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.UnitofMeasure;
import com.sena.ecom.IService.Operational.IUnitofMeasureService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/unitOfMeasure")
public class UnitofMeasureController extends ABaseController<UnitofMeasure,IUnitofMeasureService>{

	protected UnitofMeasureController(IUnitofMeasureService service) {
		super(service, "Unitof_measure");
	}

}
