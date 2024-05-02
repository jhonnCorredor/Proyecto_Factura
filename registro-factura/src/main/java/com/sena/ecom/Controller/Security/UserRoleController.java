package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.UserRole;
import com.sena.ecom.IService.Security.IUserRoleService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/userRole")
public class UserRoleController extends ABaseController<UserRole,IUserRoleService>{

	protected UserRoleController(IUserRoleService service) {
		super(service, "User_role");
	}

}
