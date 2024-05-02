package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.Roleview;
import com.sena.ecom.IService.Security.IRoleViewService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/roleView")
public class RoleViewController extends ABaseController<Roleview,IRoleViewService>{

	protected RoleViewController(IRoleViewService service) {
		super(service, "Role_view");
	}

}
