package com.sena.ecom.Controller.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Parameter.Neighborhood;
import com.sena.ecom.IService.Parameter.INeighborhoodService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/Neighborhood")
public class NeighborhoodController extends ABaseController<Neighborhood,INeighborhoodService>{

	protected NeighborhoodController(INeighborhoodService service) {
		super(service, "Neighborhood");
	}

}
