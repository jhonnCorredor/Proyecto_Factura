package com.sena.ecom.Controller.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Parameter.Municipality;
import com.sena.ecom.IService.Parameter.IMunicipalityService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/municipality")
public class MunicipalityController extends ABaseController<Municipality,IMunicipalityService>{

	protected MunicipalityController(IMunicipalityService service) {
		super(service, "Municipality");
	}

}
