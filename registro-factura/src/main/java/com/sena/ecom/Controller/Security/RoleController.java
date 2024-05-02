package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.Role;
import com.sena.ecom.IService.Security.IRoleService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/role")
public class RoleController extends ABaseController<Role,IRoleService>{

	protected RoleController(IRoleService service) {
		super(service, "Role");
	}

}
