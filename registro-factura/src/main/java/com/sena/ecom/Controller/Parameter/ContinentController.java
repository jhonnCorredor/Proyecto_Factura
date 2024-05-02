package com.sena.ecom.Controller.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Parameter.Continent;
import com.sena.ecom.IService.Parameter.IContinentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/continent")
public class ContinentController extends ABaseController<Continent,IContinentService>{

	protected ContinentController(IContinentService service) {
		super(service, "Continent");
	}

}
