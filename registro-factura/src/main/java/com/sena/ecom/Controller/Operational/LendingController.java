package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Lending;
import com.sena.ecom.IService.Operational.ILendingService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/lending")
public class LendingController extends ABaseController<Lending,ILendingService>{

	protected LendingController(ILendingService service) {
		super(service, "Lending");
	}

}
