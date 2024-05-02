package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.User;
import com.sena.ecom.IService.Security.IUserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends ABaseController<User,IUserService>{

	protected UserController(IUserService service) {
		super(service, "User");
	}

}
