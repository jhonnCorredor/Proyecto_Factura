package com.sena.ecom.Controller.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Parameter.Location;
import com.sena.ecom.IService.Parameter.ILocationService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/location")
public class LocationController extends ABaseController<Location,ILocationService>{

	protected LocationController(ILocationService service) {
		super(service, "Location");
	}

}
