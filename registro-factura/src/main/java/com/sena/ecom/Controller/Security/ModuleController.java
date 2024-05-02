package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.Module;
import com.sena.ecom.IService.Security.IModuleService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Module,IModuleService>{

	protected ModuleController(IModuleService service) {
		super(service, "Module");
	}

}
