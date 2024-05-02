package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.ModuleView;
import com.sena.ecom.IService.Security.IModuleViewService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/moduleView")
public class ModuleViewController extends ABaseController<ModuleView,IModuleViewService>{

	protected ModuleViewController(IModuleViewService service) {
		super(service, "Module_view");
	}

}
