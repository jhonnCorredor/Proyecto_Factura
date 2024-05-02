package com.sena.ecom.Controller.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Parameter.Departament;
import com.sena.ecom.IService.Parameter.IDepartamentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/departament")
public class DepartamentController extends ABaseController<Departament,IDepartamentService>{

	protected DepartamentController(IDepartamentService service) {
		super(service, "Departament");
	}

}
